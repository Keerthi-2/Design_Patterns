package Adapter_design;

public class Hdmi1 extends Vga{

    //this is not possible as it becomes is-A relationship inheritance. here hdmi and vga are two different ports not one of them is subtype of another
    public void transmitted_via_hdmi_port(){

        transmitted_via_vgi_port();
    }
}
