 /*
  *Copyright 2008 Cristian Achim
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing,
  * software distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  *
  */

package jgomoku;

import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

public class GraphicalInterface extends javax.swing.JPanel {

    private BufferedImage blackStone;
    private BufferedImage whiteStone;
    private BufferedImage middleNode;
    private BufferedImage northNode;
    private BufferedImage northEastNode;
    private BufferedImage eastNode;
    private BufferedImage southEastNode;
    private BufferedImage southNode;
    private BufferedImage southWestNode;
    private BufferedImage westNode;
    private BufferedImage northWestNode;

    /** Creates new form GInterface */
    public GraphicalInterface() {
        InputStream imageReader;

        //loading images from files in artwork folder in jar file
        try{
            imageReader=this.getClass().getResourceAsStream("/artwork/blackstone.png");
            blackStone=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/whitestone.png");
            whiteStone=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/middlenode.png");
            middleNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/northnode.png");
            northNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/northeastnode.png");
            northEastNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/eastnode.png");
            eastNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/southeastnode.png");
            southEastNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/southnode.png");
            southNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/southwestnode.png");
            southWestNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/westnode.png");
            westNode=ImageIO.read(imageReader);
            imageReader.close();

            imageReader=this.getClass().getResourceAsStream("/artwork/northwestnode.png");
            northWestNode=ImageIO.read(imageReader);
            imageReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        initComponents();
    }

    private void drawBackground(int row , int column){
        
    }

    private void drawBlackStone(int row , int column){

    }

    private void drawWhiteStone(int row , int column){
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton5.setText("Previous move");

        jLabel1.setText("black player");

        jButton6.setText("Next move");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Computer" }));

        jButton4.setText("Start game");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Computer" }));

        jButton3.setText("New game");

        jButton1.setText("Save game");

        jButton2.setText("Load game");

        jLabel2.setText("white player");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 127, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 127, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(44, 44, 44)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
