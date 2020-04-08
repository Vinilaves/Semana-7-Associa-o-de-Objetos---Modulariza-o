import javax.swing.JOptionPane;

public class TesteAtribuicao
{
   public static void main(String[] args)
   {
      String nome = JOptionPane.showInputDialog(" Nome: ");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
      String nomed = JOptionPane.showInputDialog( " Digite a Disciplina: ");
      boolean pratica= Boolean.parseBoolean(JOptionPane.showInputDialog(" Disciplina é pratica?true/false"));
      
      Professor professor = new Professor (nome, idade);
      Disciplina disciplina = new Disciplina ( nomed, pratica);
      Atribuicao atribuicao = new Atribuicao ( professor, disciplina);
      
      JOptionPane.showMessageDialog( null, atribuicao.getDados());
   }
}