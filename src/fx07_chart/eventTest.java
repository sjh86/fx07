<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.chart.AreaChart?>
<?import javafx.scene.chart.BarChart?>
<?import javafx.scene.chart.CategoryAxis?>
<?import javafx.scene.chart.NumberAxis?>
<?import javafx.scene.chart.PieChart?>
<?import javafx.scene.layout.AnchorPane?>


<AnchorPane prefHeight="373.0" prefWidth="1008.0" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8.0.171" fx:controller="fx07_chart.Controller">
   <children>
      <PieChart fx:id="pieChart" layoutX="42.0" layoutY="25.0" prefHeight="241.0" prefWidth="288.0" />
      <BarChart fx:id="barChart" layoutX="323.0" layoutY="25.0" prefHeight="256.0" prefWidth="336.0">
        <xAxis>
          <CategoryAxis side="BOTTOM" />
        </xAxis>
        <yAxis>
          <NumberAxis side="LEFT" />
        </yAxis>
      </BarChart>
      <AreaChart fx:id="areaChart" layoutX="670.0" layoutY="14.0" prefHeight="256.0" prefWidth="303.0">
        <xAxis>
          <CategoryAxis side="BOTTOM" />
        </xAxis>
        <yAxis>
          <NumberAxis side="LEFT" />
        </yAxis>
      </AreaChart>
   </children>
</AnchorPane>