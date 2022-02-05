package com.example.demo;
import javafx.animation.TranslateTransition;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {


    public int positionofplayer[][] = new int[10][10];
     public int randomvariable;
    public Label Resultofrandom;
    public Label Resultofthegame;
    public int snakeandladder[][] = new int[6][6];

    public Circle Aditya;
    public Circle Ashwin;
    public int PositionofAditya = 1;
    public int PositionofAshwin = 1;
    public boolean AdityaTurn = true;
    public boolean AshwinTurn = true;
    public int AdityaXCordinates = 20;//150
    public int AdityaYCordinate = 810;
    public int AdityaNewXCordinates = 0;
    public int AdityaNewYCordinates = 0;
    public int AshwinXPosition = 60;//620
    public int AshwinYPosition = 810;
    public int AshwinNewXcoordinates = 0;
    public int AshwinNewYCoordinates = 0;
    public int positionCircle1 = 1;
    public int positionCircle2 = 1;
    public boolean Startingofgame = false;
    public Button GameStarting;
    public static final int Sizeofboxs = 80;
    public static final int le_wdth = 10;
    public static final int br_hgth = 10;
    private Group titleGroup = new Group();

    private Parent createContent(){

          Pane root = new Pane();
//        Image image = new Image("https://media.istockphoto.com/photos/round-podium-or-pedestal-with-blue-background-picture-id1226478932?b=1&k=20&m=1226478932&s=170667a&w=0&h=hXsvxQilNanpKx7QC_tIsFUOKPl8fdIDfJ_QSKXesGE=");
//        ImageView mv = new ImageView(image);
//        root.getChildren().add(mv);
        Image image31 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/1F3A53C6-3D02-4587-B5B5-D6C4A2559081_4_5005_c.jpeg?raw=true");
        ImageView m = new ImageView(image31);
        m.setY(800);

        m.setFitHeight(80);
        m.setFitWidth(800);


        Image image7 = new Image("https://i.pinimg.com/originals/b0/88/54/b08854e2b29c5ee86876790884b406a9.gif");
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(20);
        imageView7.setY(770);
        imageView7.setFitHeight(40);
        imageView7.setFitWidth(40);

        Image imagelast = new Image("https://i2.wp.com/www.thethingaboutgreece.com/wp-content/uploads/2020/10/Down-Arrow-gif.gif?fit=319%2C338&ssl=1");
        ImageView imageViewlast = new ImageView(imagelast);
        imageViewlast.setX(363);
        imageViewlast.setY(760);
        imageViewlast.setFitHeight(70);
        imageViewlast.setFitWidth(70);




        root.setPrefSize(le_wdth * Sizeofboxs, (br_hgth * Sizeofboxs) + 80);
        root.getChildren().addAll(titleGroup);

        for(int i = 0; i< le_wdth; i++){
            for(int j = 0; j< br_hgth; j++){
                Tile tile = new Tile(Sizeofboxs, Sizeofboxs);
                tile.setTranslateX(j * Sizeofboxs);
                tile.setTranslateY(i * Sizeofboxs);
                titleGroup.getChildren().add(tile);

            }

        }

        Aditya = new Circle(40);
//        player1.setStroke(Color.WHITE);
        Image im = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/507E087C-47AD-4DBC-80F3-5780F043A731.png?raw=true",false);
        Aditya.setFill(new ImagePattern(im));

        Aditya.setId("Player 1");
//        player1.setFill(Color.GREEN);
        Aditya.getStyleClass().add("Style.css");
        Aditya.setTranslateX(AdityaXCordinates);
        Aditya.setTranslateY(AdityaYCordinate);


        Ashwin = new Circle(40);
//        player2.setStroke(Color.WHITE);
        Image im2 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/5F76E3C0-76F3-4106-9A5D-72C1F1F7626F.png?raw=true",false);

        Ashwin.setFill(new ImagePattern(im2));
        Ashwin.setId("Player 2");

        Ashwin.getStyleClass().add("Style.css");
        Ashwin.setTranslateX(AshwinXPosition);
        Ashwin.setTranslateY(AshwinYPosition);

        Button button1 = new Button();//player 1
        button1.setStyle("-fx-background-color: #0f45de");
        Image img5 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/AEF6BF7E-3BE3-4F44-A698-19DBE4FE2207_4_5005_c.jpeg?raw=true");
        ImageView view3 = new ImageView(img5);
        button1.setGraphic(view3);
        view3.setFitHeight(55);
        view3.setFitWidth(100);
        button1.setPrefSize(60, 60);
        button1.setTranslateX(240);
        button1.setTranslateY(805);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(Startingofgame){
                    if(AdityaTurn){
                        Valueondice();
                        if(randomvariable ==1){

                            Image img11 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/DC887A49-4686-409B-9410-E06E53B2C8A4_4_5005_c.jpeg?raw=true");
                            ImageView view11 = new ImageView(img11);
                            GameStarting.setGraphic(view11);
                            view11.setFitHeight(60);
                            view11.setFitWidth(100);
                            view11.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);



                        }else if(randomvariable ==2){

                            Image img12 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/BC1B958D-5F97-4C15-BF02-074A8295C9BB_4_5005_c.jpeg?raw=true");
                            ImageView view12 = new ImageView(img12);
                            GameStarting.setGraphic(view12);
                            view12.setFitHeight(60);
                            view12.setFitWidth(100);
                            view12.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==3){

                            Image img13 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/C6C8C222-7199-40D7-B09C-DD95D44AD6A4_4_5005_c.jpeg?raw=true");
                            ImageView view13 = new ImageView(img13);
                            GameStarting.setGraphic(view13);
                            view13.setFitHeight(60);
                            view13.setFitWidth(100);
                            view13.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==4){

                            Image img14 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/3B02B160-116A-4202-BF1B-A590ACC16310_4_5005_c.jpeg?raw=true");
                            ImageView view14 = new ImageView(img14);
                            GameStarting.setGraphic(view14);
                            view14.setFitHeight(60);
                            view14.setFitWidth(100);
                            view14.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==5){

                            Image img15 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/D563F2AF-3DF5-4FEA-9E61-3F29A9A9C125_4_5005_c.jpeg?raw=true");
                            ImageView view15 = new ImageView(img15);
                            GameStarting.setGraphic(view15);
                            view15.setFitHeight(60);
                            view15.setFitWidth(100);
                            view15.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else{

                            Image img16 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/C8C8E9B5-E75C-4739-A397-7912573A0FC4_4_5005_c.jpeg?raw=true");
                            ImageView view16 = new ImageView(img16);
                            GameStarting.setGraphic(view16);
                            view16.setFitHeight(60);
                            view16.setFitWidth(100);
                            view16.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(358);
                            GameStarting.setTranslateY(805);


                        }
                        Resultofrandom.setText(String.valueOf(randomvariable));
                        PositionofAditya += randomvariable;
                        moveAditya();
                        Movingplayer(AdityaXCordinates, AdityaYCordinate, Aditya);

                        AdityaTurn = false;
                        AshwinTurn = true;
                        if(Startingofgame)
                            Resultofthegame.setText("Player Two turn");
                    }
                }
            }
        });


        Button button2 = new Button();
        button2.setStyle("-fx-background-color: #0f45de");
        Image img4 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/95CEB582-D0EC-4676-98A7-FE238F7100FB_4_5005_c.jpeg?raw=true");
        ImageView view = new ImageView(img4);
        button2.setGraphic(view);
        view.setFitHeight(80);
        view.setFitWidth(100);
        view.setPreserveRatio(true);
        button2.setPrefSize(60, 60);
        button2.setTranslateX(440);
        button2.setTranslateY(805);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(Startingofgame){
                    if(AshwinTurn){
                        Valueondice();

                        if(randomvariable ==1){

                            Image img11 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/DC887A49-4686-409B-9410-E06E53B2C8A4_4_5005_c.jpeg?raw=true");
                            ImageView view11 = new ImageView(img11);
                            GameStarting.setGraphic(view11);
                            view11.setFitHeight(60);
                            view11.setFitWidth(100);
                            view11.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);



                        }else if(randomvariable ==2){

                            Image img12 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/BC1B958D-5F97-4C15-BF02-074A8295C9BB_4_5005_c.jpeg?raw=true");
                            ImageView view12 = new ImageView(img12);
                            GameStarting.setGraphic(view12);
                            view12.setFitHeight(60);
                            view12.setFitWidth(100);
                            view12.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==3){

                            Image img13 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/C6C8C222-7199-40D7-B09C-DD95D44AD6A4_4_5005_c.jpeg?raw=true");
                            ImageView view13 = new ImageView(img13);
                            GameStarting.setGraphic(view13);
                            view13.setFitHeight(60);
                            view13.setFitWidth(100);
                            view13.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==4){

                            Image img14 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/3B02B160-116A-4202-BF1B-A590ACC16310_4_5005_c.jpeg?raw=true");
                            ImageView view14 = new ImageView(img14);
                            GameStarting.setGraphic(view14);
                            view14.setFitHeight(60);
                            view14.setFitWidth(100);
                            view14.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else if(randomvariable ==5){

                            Image img15 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/D563F2AF-3DF5-4FEA-9E61-3F29A9A9C125_4_5005_c.jpeg?raw=true");
                            ImageView view15 = new ImageView(img15);
                            GameStarting.setGraphic(view15);
                            view15.setFitHeight(60);
                            view15.setFitWidth(100);
                            view15.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }else{

                            Image img16 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/C8C8E9B5-E75C-4739-A397-7912573A0FC4_4_5005_c.jpeg?raw=true");
                            ImageView view16 = new ImageView(img16);
                            GameStarting.setGraphic(view16);
                            view16.setFitHeight(60);
                            view16.setFitWidth(100);
                            view16.setPreserveRatio(true);
                            GameStarting.setPrefSize(60, 60);

                            GameStarting.setTranslateX(361);
                            GameStarting.setTranslateY(805);


                        }

                        Resultofrandom.setText(String.valueOf(randomvariable));
                        PositionofAshwin += randomvariable;
                        MoveAshwin();
                        Movingplayer(AshwinXPosition, AshwinYPosition, Ashwin);

                        AshwinTurn = false;
                        AdityaTurn = true;
                        if(Startingofgame)
                            Resultofthegame.setText("Player One turn");

                    }
                }
            }
        });


        GameStarting = new Button();
        GameStarting.setStyle("-fx-background-color: #0f45de");

        Image img6 = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/0BC95A96-45FD-4DBB-9C7B-AFB950EDC442.jpeg?raw=true");
        ImageView view4 = new ImageView(img6);
        GameStarting.setGraphic(view4);
        view4.setFitHeight(60);
        view4.setFitWidth(100);
        view4.setPreserveRatio(true);
        GameStarting.setPrefSize(60, 60);

        GameStarting.setTranslateX(348);
        GameStarting.setTranslateY(805);

        GameStarting.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(!Startingofgame) {
                    Startingofgame = true;
                    Resultofrandom.setText("Dice Result");
                    Resultofrandom.setTranslateX(600);//changed
                    GameStarting.setText("");//game satrted
                    AdityaXCordinates = 40;
                    AdityaYCordinate = 760;

                    AshwinXPosition = 40;
                    AshwinYPosition = 760;

                    PositionofAditya = 1;
                    PositionofAshwin = 1;

                    positionCircle1 = 1;
                    positionCircle2 = 1;

                    Aditya.setTranslateX(AdityaXCordinates);
                    Aditya.setTranslateY(AdityaYCordinate);
                    Ashwin.setTranslateX(AshwinXPosition);
                    Ashwin.setTranslateY(AshwinYPosition);

                    randomvariable = (int)(Math.random() * 2 +1);
                    if(randomvariable == 1)
                    {
                        AdityaTurn = true;
                        Resultofthegame.setText("Player One Turn");
                    }else
                    {
                        AshwinTurn = true;
                        Resultofthegame.setText("Player Two Turn");
                    }
                }

            }
        });

        Resultofrandom = new Label("Dice Result");
        Resultofrandom.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,15));
        Resultofrandom.setTextFill(Color.YELLOW);


        Resultofrandom.setTranslateX(600);
        Resultofrandom.setTranslateY(830);

        Resultofthegame = new Label("Game Result");
        Resultofthegame.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,15));
        Resultofthegame.setTextFill(Color.YELLOW);
        Resultofthegame.setTranslateX(700);
        Resultofthegame.setTranslateY(830);

        Image img = new Image("https://github.com/AdityaSingh123456/sddds/blob/main/2E4667CB-5D25-4354-BDEA-D7C6271CEE28.jpeg?raw=true");
        ImageView imageView = new ImageView();
        imageView.setImage(img);
        imageView.setFitWidth(800);
        imageView.setFitHeight(800);


//        titleGroup.getChildren().addAll(imageView,player1, player2, button1, button2, gameButton, randResult, gameResult,imageView7,imageViewlast);
        titleGroup.getChildren().addAll(m,imageView);
        titleGroup.getChildren().addAll(Aditya);
        titleGroup.getChildren().addAll(Ashwin);
        titleGroup.getChildren().addAll(button1);
        titleGroup.getChildren().addAll(button2);
        titleGroup.getChildren().addAll(GameStarting);
        titleGroup.getChildren().addAll(Resultofrandom);
        titleGroup.getChildren().addAll(Resultofthegame);
        titleGroup.getChildren().addAll(imageView7,imageViewlast);


        return root;

    }

    public void Valueondice(){
        randomvariable = (int)(Math.random() * 6 +1);

    }

    public void moveAditya() {

        if (AdityaXCordinates == 40 && AdityaYCordinate == 40) {
            AdityaXCordinates = 40;
            AdityaYCordinate = 40;
        }

        for (int i = 0; i < randomvariable; i++) {
            if (positionCircle1 % 2 == 1) {
                AdityaXCordinates += 80;
            }
            if (positionCircle1 % 2 == 0) {
                AdityaXCordinates -= 80;
            }
            if (AdityaXCordinates > 760) {
                AdityaYCordinate -= 80;
                AdityaXCordinates -= 80;
                positionCircle1++;
            }
            if (AdityaXCordinates < 40) {
                AdityaYCordinate -= 80;
                AdityaXCordinates += 80;
                positionCircle1++;
            }

            if (AdityaXCordinates < 30 || AdityaYCordinate < 30 || PositionofAditya == 100) {
                AdityaXCordinates = 40;
                AdityaYCordinate = 40;
                Resultofthegame.setTranslateX(700);
                Alert.display("Game End","Player One Won");
                Resultofthegame.setText("Player One Won");
                GameStarting.setText("");
                Startingofgame = false;
            }
        }
        movenewAditya();
    }

    // New positions of player1 for Snakes and Ladders
    public void movenewAditya(){
        if(PositionofAditya ==7){
            Aditya.setTranslateX(520);
            Aditya.setTranslateY(760);



            AdityaXCordinates =600;
            AdityaYCordinate =680;


            positionCircle1 += 1;
            PositionofAditya = 13;

        }



        //correct
        if(PositionofAditya ==19){//120 and //680

            AdityaXCordinates = 360;
            AdityaYCordinate = 760;
            positionCircle1 -= 1;
            PositionofAditya = 5;

        }
        //correct
        if(PositionofAditya ==25){
            Aditya.setTranslateX(360);
            Aditya.setTranslateY(600);

            AdityaXCordinates =520 ; AdityaYCordinate =120 ;
            positionCircle1 += 6;
            PositionofAditya = 87;
        }
        //correct
        if(PositionofAditya ==32){
            AdityaXCordinates = 440; AdityaYCordinate =680 ;
            positionCircle1 -= 2;
            PositionofAditya = 15;
        }
        if(PositionofAditya ==37){
            Aditya.setTranslateX(280);
            Aditya.setTranslateY(520);

            AdityaXCordinates = 200; AdityaYCordinate = 520;
            positionCircle1 += 3;
            PositionofAditya = 63;
        }
        if(PositionofAditya ==51){
            Aditya.setTranslateX(760);
            Aditya.setTranslateY(360);

            AdityaXCordinates = 680; AdityaYCordinate = 40;
            positionCircle1 += 4;
            PositionofAditya = 92;
        }
        if(PositionofAditya ==60){
            Aditya.setTranslateX(40);
            Aditya.setTranslateY(360);

            AdityaXCordinates = 40; AdityaYCordinate = 120;
            positionCircle1 += 3;
            PositionofAditya = 81;
        }
        if(PositionofAditya ==79){
            AdityaXCordinates = 360; AdityaYCordinate = 800-440;
            positionCircle1 -= 2;
            PositionofAditya = 56;
        }
        if(PositionofAditya ==90){
            AdityaXCordinates = 200; AdityaYCordinate = 800-200;
            positionCircle1 -= 6;
            PositionofAditya = 23;

        }
        if(PositionofAditya ==97){
            AdityaXCordinates = 440; AdityaYCordinate = 120;
            positionCircle1 -= 1;
            PositionofAditya = 86;
        }



        AdityaTurn = false;
        AshwinTurn = true;
        if(Startingofgame)
            Resultofthegame.setText("Player Two turn");
    }

    public void MoveAshwin() {

        if (AdityaXCordinates == 40 && AdityaYCordinate == 40) {
            AdityaXCordinates = 40;
            AdityaYCordinate = 40;
        }

        for (int i = 0; i < randomvariable; i++) {
            if (positionCircle2 % 2 == 1) {
                AshwinXPosition += 80;
            }
            if (positionCircle2 % 2 == 0) {
                AshwinXPosition -= 80;
            }
            if (AshwinXPosition > 760) {
                AshwinYPosition -= 80;
                AshwinXPosition -= 80;
                positionCircle2++;
            }
            if (AshwinXPosition < 40) {
                AshwinYPosition -= 80;
                AshwinXPosition += 80;
                positionCircle2++;
            }
            //AshwinXPosition < 30 || AshwinYPosition < 30 || PositionofAshwin == 100

            if (AshwinXPosition < 30 || AshwinYPosition < 30 || PositionofAshwin == 100) {
                AshwinXPosition = 40;
                AshwinYPosition = 40;
                Resultofthegame.setTranslateX(700);
                Alert.display("Game End","Player Two Won");
                Resultofthegame.setText("Player Two Won");
                GameStarting.setText("");
                Startingofgame = false;
            }
        }
        MovenewAshwin();
    }

    // New positions of player2 for Snakes and Ladders
    public void MovenewAshwin(){
         // corerect
        if(PositionofAshwin ==7){
            Ashwin.setTranslateX(520);
            Ashwin.setTranslateY(760);

            AshwinXPosition = 600; AshwinYPosition = 680;
            positionCircle2 += 1;
            PositionofAshwin = 13;

        }
        //correct
        if(PositionofAshwin ==19){//120 and 680


            AshwinXPosition = 360; AshwinYPosition = 760;
            positionCircle2 -= 1;
            PositionofAshwin = 5;

        }
        //correct
        if(PositionofAshwin ==25){
            Ashwin.setTranslateX(360);
            Ashwin.setTranslateY(600);

            AshwinXPosition =520 ; AshwinYPosition =120 ;
            positionCircle2 += 6;
            PositionofAshwin = 87;
        }
        //correct
        if(PositionofAshwin ==32){
            AshwinXPosition = 440; AshwinYPosition =680 ;
            positionCircle2 -= 2;
            PositionofAshwin = 15;
        }
        if(PositionofAshwin ==37){
            Ashwin.setTranslateX(280);
            Ashwin.setTranslateY(520);

            AshwinXPosition = 200; AshwinYPosition = 520;
            positionCircle2 += 3;
            PositionofAshwin = 63;
        }
        if(PositionofAshwin ==51){
            Ashwin.setTranslateX(760);
            Ashwin.setTranslateY(360);

            AshwinXPosition = 680; AshwinYPosition = 40;
            positionCircle2 += 4;
            PositionofAshwin = 92;
        }
        if(PositionofAshwin ==60){
            Ashwin.setTranslateX(40);
            Ashwin.setTranslateY(360);

            AshwinXPosition = 40; AshwinYPosition = 120;
            positionCircle2 += 3;
            PositionofAshwin = 81;
        }
        if(PositionofAshwin ==79){
            AshwinXPosition = 360; AshwinYPosition = 800-440;
            positionCircle2 -= 2;
            PositionofAshwin = 56;
        }
        if(PositionofAshwin ==90){
            AshwinXPosition = 200; AshwinYPosition = 800-200;
            positionCircle2 -= 6;
            PositionofAshwin = 23;

        }
        if(PositionofAshwin ==97){
            AshwinXPosition = 440; AshwinYPosition = 120;
            positionCircle2 -= 1;
            PositionofAshwin = 86;
        }



        AshwinTurn = false;
        AdityaTurn = true;
        if(Startingofgame)
            Resultofthegame.setText("Player One turn");
    }

    public void Movingplayer(int a, int b, Circle d){

        TranslateTransition makemove = new TranslateTransition(Duration.millis(1000), d);
        makemove.setToX(a);
        makemove.setToY(b);
        makemove.setAutoReverse(false);
        makemove.play();
    }


    @Override
    public void start(Stage stagem) throws Exception{

        Scene scene = new Scene(createContent());
//        scene.getStylesheets().add(getClass().getResource("src/main/java/style.css").toExternalForm());

        stagem.setTitle("Snake & Ladder Christmas Theme");
        stagem.setResizable(false);
        stagem.setScene(scene);
        stagem.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}