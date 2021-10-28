package pages;


public class intranetPage extends BasePage {

    private String espacioUsuario = "//input[@name='sUsername']";
    private String espacioContraseña = "//input[@name='sPassword']";
    private String Login = "//tbody/tr[4]/td[4]/input[1]";

    public intranetPage (){
        super(driver);
    }
    
    public void ingresarIntra(){
        ingresarA("http://pre.intranet.osde/");
    }

    public void clickUsuario(String criteria){
        write(espacioUsuario, criteria);
    }

    public void clickContraseña (){
        clickElement(espacioContraseña);
    }

    public void escribirContraseña (String criteria){
        write(espacioContraseña, criteria);    
    }

    public void loguearse (){
        clickElement(Login);
    }

 }