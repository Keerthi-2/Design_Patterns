package Adapter_design;

public class Hdmi_to_vga_Adapter implements Hdmi{

    Vga vga;
    public Hdmi_to_vga_Adapter(Vga vga){
        this.vga=vga;
    }

    @Override
    public void transmitted_via_hdmi_port() {
        vga.transmitted_via_vgi_port();
    }
}
