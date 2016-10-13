package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import org.jgraph.*;
import org.jgraph.graph.DefaultEdge;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableDirectedGraph;

public class Main extends Application {
	
	private JGraphModelAdapter m_jgAdapter;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
		//neuen Graphen erstellen
		ListenableGraph g = new ListenableDirectedGraph(DefaultEdge.class);
		
		//einen neuen Adapter erstellen
		m_jgAdapter = new JGraphModelAdapter<>(g);
		
		
		} catch(Exception e) {
			e.printStackTrace();
			
			
			
			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
