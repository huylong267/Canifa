package application.controller;

import application.data.model.PagingableItemList;
import application.data.model.Product;
import application.data.service.ProductService;
import application.data.service.ProductServiceImp;
import application.viewmodel.common.LogoVM;
import application.viewmodel.common.ProductVM;
import application.viewmodel.homelanding.AddList;
import application.viewmodel.homelanding.BannerVM;
import application.viewmodel.homelanding.HomeLanding;
import application.viewmodel.homelanding.MenuItemVM;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@Controller
@RequestMapping(path = "/")
public class ProductController {
    private static  final Logger LOGGER= LogManager.getLogger(ProductController.class);
    @Autowired
    private ProductServiceImp productServiceImp;
    private String[] images={"https://canifa.s3.amazonaws.com/media/catalog/product/cache_generated/235x310/8bs17s029-sk010-m.jpg",
    "https://canifa.s3.amazonaws.com/media/catalog/product/cache_generated/235x310/8bs17s015-sb148-m.jpg",
    "https://canifa.s3.amazonaws.com/media/catalog/product/cache_generated/235x310/8bp17w003-sa046-m_1.jpg",
    "https://canifa.s3.amazonaws.com/media/catalog/product/cache_generated/235x310/8ot17w023-sa046-m.jpg"};
    private  int[] prices={369000,349000,650000,230000,698000};

    @GetMapping("/")
    public String index(Model model, @RequestParam(value = "pageSize",required = false)String ps,
                        @RequestParam(value = "pageNumber",required = false)String pn){
        HomeLanding homeLanding = new HomeLanding();
        LogoVM logoVM = new LogoVM("https://canifa.s3.amazonaws.com/media/wysiwyg/info/logo.jpg","Canifa");
        AddList addList = new AddList();
        ArrayList listHrMenuItemsVM = (ArrayList) addList.addListVM();
        ArrayList<BannerVM> listBannerVM = new ArrayList<>();
        listBannerVM.add(new BannerVM("https://canifa.s3.amazonaws.com/media/catalog/category/active-cool.jpg","canifa"));

        long totalProducts = productServiceImp.getTotalProducts();
        if(totalProducts <= 0){
            ArrayList<Product> listProducts = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                Product product = new Product();
                product.setCreate_date(new Date());
                product.setName("Product " +i);
                product.setShort_desc("Description for product "+i);
                product.setImage(images[random.nextInt(images.length)]);
                product.setPrice(prices[random.nextInt(prices.length)]);
                listProducts.add(product);
            }
            productServiceImp.addNewListProducts(listProducts);
            LOGGER.debug("------------Thêm list sản phẩm thành công-------------");

        }
        else {
            LOGGER.debug("------------Đã có sản phẩm-------------");
        }
            PagingableItemList<Product> pagingProductLuyentapVM = productServiceImp.getListProducts(4,0);
            ArrayList<ProductVM> listProductLuyentapVM = new ArrayList<>();
            ModelMapper modelMapper = new ModelMapper();
            for (Product product:pagingProductLuyentapVM.getListData()) {
                ProductVM productVM = modelMapper.map(product,ProductVM.class);
                listProductLuyentapVM.add(productVM);
            }

            PagingableItemList<Product> pagingProductAoKhoacVM = productServiceImp.getListProducts(8, 1);
            ArrayList<ProductVM> listProductAoKhoacVM=  new ArrayList<>();
        for (Product product: pagingProductAoKhoacVM.getListData()) {
            ProductVM productVM = modelMapper.map(product,ProductVM.class);
            listProductAoKhoacVM.add(productVM);
        }
        PagingableItemList<Product> pagingProductAoPhongVM = productServiceImp.getListProducts(20, 2);
        ArrayList<ProductVM> listProductAoPhongVM=  new ArrayList<>();
        for (Product product: pagingProductAoPhongVM.getListData()) {
            ProductVM productVM = modelMapper.map(product,ProductVM.class);
            listProductAoPhongVM.add(productVM);
        }
    homeLanding.setLogoVM(logoVM);
    homeLanding.setListHrMenuItemsVM(listHrMenuItemsVM);
    homeLanding.setListProductLuyentapVM(listProductLuyentapVM);
    homeLanding.setListProductAoKhoacVM(listProductAoKhoacVM);
    homeLanding.setListProductAoPhongVM(listProductAoPhongVM);
    homeLanding.setListBannerVM(listBannerVM);
    model.addAttribute("vm",homeLanding);
    return "canifa";
    }
}
