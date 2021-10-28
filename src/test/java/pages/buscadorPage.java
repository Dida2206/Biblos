package pages;


public class buscadorPage extends BasePage{

    private String espacioUrl = "/html[1]/body[1]/center[1]/input[1]";
    private String urlBuscador = "https://buscadorpp.biblos.intranet.osde/buscador/";
    private String botonIr = "/html[1]/body[1]/center[1]/input[2]";
    private String espacioBusqueda ="/html[1]/body[1]/nav[1]/div[1]/form[1]/div[1]/input[1]";
    private String busqueda1 = "vacuna";
    private String accesoPagina = "/html[1]/body[1]/ul[1]/li[1]/a[1]/strong[1]";
    private String solapaDefinicion ="//body/div[4]/div[1]/div[2]/ul[1]/li[8]/a[1]";
    private String info = "//body/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]";
    private String elementoInfo = "//span[contains(text(),'Info Dirección Comercial')]";
    private String iconoAyuda = "//i[@class='fas fa-question']";

    public buscadorPage (){
        super(driver);
    }
    
    public void ingresoUrl(){
        clickElement(espacioUrl);
        Find(espacioUrl).clear();
        write(espacioUrl, urlBuscador);
    }

    public void hagoClick(){
        clickElement(botonIr);
    }

    public void hacerBusqueda(){
        write(espacioBusqueda, busqueda1);
    }

    public void accederPagina(){
        clickElement(accesoPagina);
    }

   public void comprobarElemento(){
       clickElement(solapaDefinicion);
   }

   public void cerrarPestaña(){
       switchToParentFrame();
   }

   public void ingresarAyuda(){
       clickElement(iconoAyuda);
   }

   public void iconoInfo(){
       clickElement(info);
   }

   public void comprobarIcono(){
       clickElement(elementoInfo);
   }

   public void estadoElemento(){
       clickElement(solapaDefinicion);
   }

   public void ingresoAyuda(){
       clickElement(iconoAyuda);
   }
}
