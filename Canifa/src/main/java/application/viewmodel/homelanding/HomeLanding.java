package application.viewmodel.homelanding;

import application.viewmodel.common.LogoVM;
import application.viewmodel.common.ProductVM;

import java.util.ArrayList;

public class HomeLanding {
    private LogoVM logoVM;
    private ArrayList<MenuItemVM> listHrMenuItemsVM;
    private ArrayList<MenuItemVM> listVtMenuItemsVM;
    private ArrayList<ProductVM> listProductLuyentapVM;
    private ArrayList<ProductVM> listProductAoKhoacVM;
    private ArrayList<ProductVM> listProductAoPhongVM;
    private ArrayList<BannerVM> listBannerVM;

    public LogoVM getLogoVM() {
        return logoVM;
    }

    public void setLogoVM(LogoVM logoVM) {
        this.logoVM = logoVM;
    }

    public ArrayList<MenuItemVM> getListHrMenuItemsVM() {
        return listHrMenuItemsVM;
    }

    public void setListHrMenuItemsVM(ArrayList<MenuItemVM> listHrMenuItemsVM) {
        this.listHrMenuItemsVM = listHrMenuItemsVM;
    }

    public ArrayList<MenuItemVM> getListVtMenuItemsVM() {
        return listVtMenuItemsVM;
    }

    public void setListVtMenuItemsVM(ArrayList<MenuItemVM> listVtMenuItemsVM) {
        this.listVtMenuItemsVM = listVtMenuItemsVM;
    }

    public ArrayList<ProductVM> getListProductLuyentapVM() {
        return listProductLuyentapVM;
    }

    public void setListProductLuyentapVM(ArrayList<ProductVM> listProductLuyentapVM) {
        this.listProductLuyentapVM = listProductLuyentapVM;
    }

    public ArrayList<ProductVM> getListProductAoKhoacVM() {
        return listProductAoKhoacVM;
    }

    public void setListProductAoKhoacVM(ArrayList<ProductVM> listProductAoKhoacVM) {
        this.listProductAoKhoacVM = listProductAoKhoacVM;
    }

    public ArrayList<ProductVM> getListProductAoPhongVM() {
        return listProductAoPhongVM;
    }

    public void setListProductAoPhongVM(ArrayList<ProductVM> listProductAoPhongVM) {
        this.listProductAoPhongVM = listProductAoPhongVM;
    }

    public ArrayList<BannerVM> getListBannerVM() {
        return listBannerVM;
    }

    public void setListBannerVM(ArrayList<BannerVM> listBannerVM) {
        this.listBannerVM = listBannerVM;
    }
}
