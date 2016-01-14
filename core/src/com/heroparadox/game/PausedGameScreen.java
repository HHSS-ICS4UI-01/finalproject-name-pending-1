/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroparadox.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 *
 * @author tituo4996
 */
public class PausedGameScreen implements Screen {
GdxGame game; // Note it's "MyGame" not "Game"
 
        // my games virtual width and height
        public final int V_WIDTH = 1024;
        public final int V_HEIGHT = 1280;

        private Viewport viewport;
        private OrthographicCamera camera;
        private SpriteBatch batch;
        private Texture logo;
    
    

        public PausedGameScreen(GdxGame game){
            this.game = game;
            camera = new OrthographicCamera();
            viewport = new FitViewport(V_WIDTH, V_HEIGHT, camera);
            logo = new Texture("pauseScreen.png");
        }
        
        @Override
        public void render(float delta) {
            //render the main menu picture
             if (Gdx.input.isButtonPressed(Keys.SPACE)) 
                 game.setScreen(game.mainGame);
             else if (Gdx.input.isButtonPressed(Keys.ESCAPE)) 
                 game.setScreen(game.mainMenuScreen);
             
             
             
                 
        }
 

       @Override
        public void resize(int width, int height) {
        }
 

       @Override
        public void show() {
             // called when this screen is set as the screen with game.setScreen();
        }
 

       @Override
        public void hide() {
             // called when current screen changes from this to a different screen
        }
 

       @Override
        public void pause() {
        }
 

       @Override
        public void resume() {
        }
 

       @Override
        public void dispose() {
                // never called automatically
        }
}
