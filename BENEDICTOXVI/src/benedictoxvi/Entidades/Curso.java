/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
public class Curso {
    private String codigoCurso;
    private String nombreCurso;
    private String syllabus;

    
     public Curso()
     {
         this.codigoCurso = "";
         this.nombreCurso = "";
         this.syllabus = "";
     }
             
    public Curso(String pCodigo,String pnombreCurso, String pSyllabus)
    {
        this.codigoCurso = pCodigo;
        this.nombreCurso = pnombreCurso;
        this.syllabus = pSyllabus;
    }
    
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String CodigoCurso) {
        this.codigoCurso = CodigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.nombreCurso = NombreCurso;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }
    
    
            
}
