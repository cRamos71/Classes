module edu.ufp.inf.aed2_lp2_2324_students {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires edu.princeton.cs.algs4;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires algs4;

    opens edu.ufp.inf to javafx.fxml;
    exports edu.ufp.inf.aed2;

    exports edu.ufp.inf.lp2;

    opens edu.ufp.inf.lp2 to javafx.fxml;
    exports edu.ufp.inf;
    exports edu.ufp.inf.aed2.ficha2;
    exports edu.ufp.inf.lp2.p01_intro;
    opens edu.ufp.inf.lp2.p01_intro to javafx.fxml;
}