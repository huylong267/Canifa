package application.viewmodel.homelanding;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    public List<MenuItemVM> addListVM(){
        ArrayList<MenuItemVM> listHrMenuItemsVM = new ArrayList<>();
        listHrMenuItemsVM.add(new MenuItemVM("NAM","/"));
        listHrMenuItemsVM.add(new MenuItemVM("NỮ","/"));
        listHrMenuItemsVM.add(new MenuItemVM("BÉ TRAI","/"));
        listHrMenuItemsVM.add(new MenuItemVM("BÉ GÁI","/"));
        listHrMenuItemsVM.add(new MenuItemVM("NEW ARRIVALS","/"));
        listHrMenuItemsVM.add(new MenuItemVM("SALE","/"));

        //Menu hr nam
        listHrMenuItemsVM.get(0).getChild().add(new MenuItemVM("DANH MỤC SẢN PHẨM","/"));
        listHrMenuItemsVM.get(0).getChild().add(new MenuItemVM("SẢN PHẨM MỚI","/"));
        listHrMenuItemsVM.get(0).getChild().add(new MenuItemVM("SALE","/"));
        listHrMenuItemsVM.get(0).getChild().add(new MenuItemVM("SẢN PHẨM ĐẶC BIỆT","/"));
        listHrMenuItemsVM.get(0).getChild().add(new MenuItemVM("BỘ SƯU TẬP","/"));


        //Danh mục sản phẩm
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Áo len","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Áo khoác","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Áo sơ mi","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Áo kiểu","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Áo phông","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Quần jeans","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Quần vải","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Quần khaki","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Quần shorts","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Trang phục đi làm","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc nhà","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc trong","/"));
        listHrMenuItemsVM.get(0).getChild().get(0).getChild().add(new MenuItemVM("Phụ kiện","/"));

        //Sản phẩm đặc biệt
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Len Cashmere","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Giữ nhiệt","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Chống thấm nước","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("SP đạt chứng chỉ an toàn","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Thoát ẩm vượt trội","/"));
        listHrMenuItemsVM.get(0).getChild().get(3).getChild().add(new MenuItemVM("Chống nắng","/"));

        //Bộ sưu tập
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Celebration on Earth","/"));
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Be Active Be Cool","/"));
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Sport Inspiration","/"));
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Mickey","/"));
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Color of nature-Sắc mộc","/"));
        listHrMenuItemsVM.get(0).getChild().get(4).getChild().add(new MenuItemVM("Urban Cool by Lê Hà","/"));

        //Menu hr Nữ
        listHrMenuItemsVM.get(1).getChild().add(new MenuItemVM("DANH MỤC SẢN PHẨM","/"));
        listHrMenuItemsVM.get(1).getChild().add(new MenuItemVM("SẢN PHẨM MỚI","/"));
        listHrMenuItemsVM.get(1).getChild().add(new MenuItemVM("SALE","/"));
        listHrMenuItemsVM.get(1).getChild().add(new MenuItemVM("SẢN PHẨM ĐẶC BIỆT","/"));
        listHrMenuItemsVM.get(1).getChild().add(new MenuItemVM("BỘ SƯU TẬP","/"));

        //Danh mục sản phẩm
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Áo len","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Áo khoác","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Áo sơ mi","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Áo kiểu","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Áo phông","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Quần jeans","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Quần vải","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Quần khaki","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Quần shorts","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Trang phục đi làm","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc nhà","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc trong","/"));
        listHrMenuItemsVM.get(1).getChild().get(0).getChild().add(new MenuItemVM("Phụ kiện","/"));

        //Sản phẩm đặc biệt
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Len Cashmere","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Giữ nhiệt","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Chống thấm nước","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("SP đạt chứng chỉ an toàn","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Thoát ẩm vượt trội","/"));
        listHrMenuItemsVM.get(1).getChild().get(3).getChild().add(new MenuItemVM("Chống nắng","/"));

        //Bộ sưu tập
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Celebration on Earth","/"));
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Be Active Be Cool","/"));
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Sport Inspiration","/"));
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Mickey","/"));
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Color of nature-Sắc mộc","/"));
        listHrMenuItemsVM.get(1).getChild().get(4).getChild().add(new MenuItemVM("Urban Cool by Lê Hà","/"));

        //Menu hr bé trai
        listHrMenuItemsVM.get(2).getChild().add(new MenuItemVM("DANH MỤC SẢN PHẨM","/"));
        listHrMenuItemsVM.get(2).getChild().add(new MenuItemVM("SẢN PHẨM MỚI","/"));
        listHrMenuItemsVM.get(2).getChild().add(new MenuItemVM("SALE","/"));
        listHrMenuItemsVM.get(2).getChild().add(new MenuItemVM("SẢN PHẨM ĐẶC BIỆT","/"));
        listHrMenuItemsVM.get(2).getChild().add(new MenuItemVM("BỘ SƯU TẬP","/"));

        //Danh mục sản phẩm
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Áo len","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Áo khoác","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Áo sơ mi","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Áo kiểu","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Áo phông","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Quần jeans","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Quần vải","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Quần khaki","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Quần shorts","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc nhà","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc trong","/"));
        listHrMenuItemsVM.get(2).getChild().get(0).getChild().add(new MenuItemVM("Phụ kiện","/"));

        //Sản phẩm đặc biệt
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Len Cashmere","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Giữ nhiệt","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Chống thấm nước","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("SP đạt chứng chỉ an toàn","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Thoát ẩm vượt trội","/"));
        listHrMenuItemsVM.get(2).getChild().get(3).getChild().add(new MenuItemVM("Chống nắng","/"));

        //Bộ sưu tập
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Celebration on Earth","/"));
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Be Active Be Cool","/"));
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Sport Inspiration","/"));
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Mickey","/"));
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Color of nature-Sắc mộc","/"));
        listHrMenuItemsVM.get(2).getChild().get(4).getChild().add(new MenuItemVM("Urban Cool by Lê Hà","/"));

        // Menu hr bé gái
        listHrMenuItemsVM.get(3).getChild().add(new MenuItemVM("DANH MỤC SẢN PHẨM","/"));
        listHrMenuItemsVM.get(3).getChild().add(new MenuItemVM("SẢN PHẨM MỚI","/"));
        listHrMenuItemsVM.get(3).getChild().add(new MenuItemVM("SALE","/"));
        listHrMenuItemsVM.get(3).getChild().add(new MenuItemVM("SẢN PHẨM ĐẶC BIỆT","/"));
        listHrMenuItemsVM.get(3).getChild().add(new MenuItemVM("BỘ SƯU TẬP","/"));

        //Danh mục sản phẩm
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Áo len","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Áo khoác","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Áo sơ mi","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Áo kiểu","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Áo phông","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Quần jeans","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Quần vải","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Quần khaki","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Quần shorts","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc nhà","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Đồ mặc trong","/"));
        listHrMenuItemsVM.get(3).getChild().get(0).getChild().add(new MenuItemVM("Phụ kiện","/"));

        //Sản phẩm đặc biệt
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Trang phục luyện tập","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Len Cashmere","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Giữ nhiệt","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Chống thấm nước","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("SP đạt chứng chỉ an toàn","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Thoát ẩm vượt trội","/"));
        listHrMenuItemsVM.get(3).getChild().get(3).getChild().add(new MenuItemVM("Chống nắng","/"));

        //Bộ sưu tập
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Celebration on Earth","/"));
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Be Active Be Cool","/"));
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Sport Inspiration","/"));
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Mickey","/"));
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Color of nature-Sắc mộc","/"));
        listHrMenuItemsVM.get(3).getChild().get(4).getChild().add(new MenuItemVM("Urban Cool by Lê Hà","/"));

        //Menu hr new arrivals
        listHrMenuItemsVM.get(4).getChild().add(new MenuItemVM("NAM","/"));
        listHrMenuItemsVM.get(4).getChild().add(new MenuItemVM("NỮ","/"));
        listHrMenuItemsVM.get(4).getChild().add(new MenuItemVM("BÉ TRAI","/"));
        listHrMenuItemsVM.get(4).getChild().add(new MenuItemVM("BÉ GÁI","/"));

        //Menu hr sale
        listHrMenuItemsVM.get(5).getChild().add(new MenuItemVM("NAM","/"));
        listHrMenuItemsVM.get(5).getChild().add(new MenuItemVM("NỮ","/"));
        listHrMenuItemsVM.get(5).getChild().add(new MenuItemVM("BÉ TRAI","/"));
        listHrMenuItemsVM.get(5).getChild().add(new MenuItemVM("BÉ GÁI","/"));
        return listHrMenuItemsVM;
    }
}
