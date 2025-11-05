public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String password;

    public Usuario(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean autenticarUsuario(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Usuario autenticado correctamente");
            return true;
        } else {
            System.out.println("Usuario incorrecto");
            return false;
        }
    }

    public boolean validacionUsuario() {

        if (!nombre.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            System.out.println("Usuario valido");
            return true;
        } else {
            System.out.println("Usuario invalido");
            return false;
        }

    }

}
