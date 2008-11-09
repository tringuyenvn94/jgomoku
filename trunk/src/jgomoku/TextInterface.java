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

public class TextInterface implements UserInterface{
    public void printText(String text){

    }

    public boolean removeBlack(int row , int column){

        return true;
    }

    public boolean removeWhite(int row , int column){

        return true;
    }

    public boolean moveBlack(int row , int column){

        return true;
    }

    public boolean moveWhite(int row , int column){

        return true;
    }

    public String getUserInput(){

        return "";
    }

    public void setCallback(GameController gc){

    }

}
