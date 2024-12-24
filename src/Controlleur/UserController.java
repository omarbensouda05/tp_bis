package Controlleur;
import Service.Service;
public class UserController {
    private Service notificationService;

    public UserController(Service notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.execute();
    }
}