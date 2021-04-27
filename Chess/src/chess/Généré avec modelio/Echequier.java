import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4450187e-5a18-4f9b-8d69-31758cd74e7b")
public class Echequier {
    @objid ("3fea1e89-9fd1-4525-bafd-ba07b53f2f5f")
    public Piece[] board;

    @objid ("cf622053-9a3f-43db-bc1b-739985112ba2")
    public List<Piece> piece = new ArrayList<Piece> ();

    @objid ("ebada7d5-2d92-473f-9763-233acfe37a70")
    public String toString() {
    }

}
