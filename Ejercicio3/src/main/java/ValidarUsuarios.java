public class ValidarUsuarios {


    public boolean validacionUsuario(Usuario u) {

        if (!u.getNombre().isEmpty() && !u.getEmail().isEmpty() && !u.getPassword().isEmpty()) {
            System.out.println("Usuario valido");
            return true;
        } else {
            System.out.println("Usuario invalido");
            return false;
        }

    }
}
