package application.data.service;

import application.data.model.PagingableItemList;
import application.data.model.Product;
import application.data.respository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImp {
    @Autowired
    private ProductRespository productRespository;

    public void addNewProduct(Product product){
        productRespository.save(product);
    }

    @Transactional
    public  void addNewListProducts(List<Product> productList){
        productRespository.save(productList);
    }

    public  long getTotalProducts(){
     return    productRespository.getTotalProducts();
    }

    public PagingableItemList<Product> getListProducts(int pageSize, int pageNumber){
        PagingableItemList<Product> pagingableItemList = new PagingableItemList<>();
        pagingableItemList.setPageSize(pageSize);
        pagingableItemList.setPageNumber(pageNumber);
        Page<Product> page = productRespository.findAll(new PageRequest(pageNumber,pageSize));
        pagingableItemList.setTotalProducts(page.getTotalElements());
        pagingableItemList.setListData(page.getContent());
        return  pagingableItemList;

    }

}
