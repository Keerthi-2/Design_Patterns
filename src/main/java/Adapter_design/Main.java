package Adapter_design;

public class Main {
    public static void main(String[] args){

        Vga vga=new Vga();
        Hdmi hdmi=new Hdmi_to_vga_Adapter(vga);
        hdmi.transmitted_via_hdmi_port(); //it should print as transmitted as vga

         // here i am creating hdmi1 object by inherting vga class which is not possible as they are not subtypes
//        Hdmi1 hdmi1=new Hdmi1();
//        hdmi1.transmitted_via_hdmi_port();

    }
}
