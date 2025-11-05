public class AutenticarUsuarios {

    public boolean autenticarUsuario(String email, String password) {
        if (email.equals("admin") && password.equals("admin")) {
            System.out.println("Usuario autenticado correctamente");
            return true;
        } else {
            System.out.println("Usuario incorrecto");
            return false;
        }
    }
}
