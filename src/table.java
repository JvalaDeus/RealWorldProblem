import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class table extends JFrame {
	JTable jt;
	String[] column_headers = {"Team", "Points", "Goal diff"};
	String[][] team_statistics = {{"a","b","c"},{"2","3","t"}, {"d","e","f"}};

	public table(){
		jt = new JTable(team_statistics, column_headers);
		jt.setBounds(50,50,200,200);
		JScrollPane js = new JScrollPane(jt);
		this.add(js);
		this.setSize(300,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new table();
	}
}