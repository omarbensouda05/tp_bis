import Classes.SMSService;
import Controlleur.UserController;
import Classes.IoCContainer;
import Classes.EmailService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IoCContainer container = new IoCContainer();
// Enregistrer les services
        container. registerService(EmailService.class, new EmailService());
        container.registerService(SMSService.class, new SMSService());
// Obtenir le service via le conteneur
        UserController userControllerEmail = new UserController (container.getService(EmailService.class))
        userControllerEmail.notifyUser();

        UserController userControllerSMS = new UserController(container.getService(SMSService.class));
        userControllerEmail.notifyUser();

    }
}