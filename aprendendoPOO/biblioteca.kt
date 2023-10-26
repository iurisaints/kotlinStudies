interface Biblioteca{
    fun cadastrarLivro();
    fun cadastrarUsuario();
    fun emprestarLivro();
    fun devolverLivro();
    fun consultarLivrosDisponiveis();
}

class Livro{
}

class Usuario{
    constructor(id: Int, nome: String, email: String){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.livrosEmprestados = [];
    }
}

class SistemaBiblioteca : Biblioteca{
    val livros = mutableListOf<Livro>()
    val usuarios = mutableListOf<Usuario>()

    override fun cadastrarLivro(){
        print("Digite o ID do usuário: ")
        val id = readLine()?.toInt() ?: 0

        print("Digite o nome do usuário: ")
        val nome = readLine() ?: ""
        
        print("Digite o email do usuário: ")
        val email = readLine() ?: ""
        
        val usuario = Usuario(id, nome, email)

        usuarios.add(usuario)

        usuarios.forEach { user -> println(user) }

        println("$usuarios")

        println("Usuário criado com sucesso e adicionado à lista de usuários!")
    }
    override fun cadastrarUsuario(){

    }
    override fun emprestarLivro(){
        
    }
    override fun devolverLivro(){
        
    }
    override fun consultarLivrosDisponiveis(){
        
    }
}


fun main(){
    val biblio = SistemaBiblioteca()
    biblio.cadastrarUsuario()
}