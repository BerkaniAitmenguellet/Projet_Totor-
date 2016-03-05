package com.example.shad.projetosnomade;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;



/**
 * Created by shad on 18/12/15.
 */


public class IntelligenceWorkout_Activity extends Activity {

    
private IntelligenceWorkoutView intelligenceWorkoutView;

   
 @Override
   
  onClick(View view) {
                soundlanched = !soundlanched;
                if (soundlanched) {
                    ButtonSon.setText(R.string.btn_sonoui);
                    mMediaPlayerbckgnd.start();
                } else {
                    ButtonSon.setText(R.string.btn_sonnon);
                    if(mMediaPlayerbckgnd.isPlaying()) {
                        mMediaPlayerbckgnd.pause();

                    }
                }
            }
        });

        ButtonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(instance, intelligent.class);
                startActivity(intent);
            }
        });


    }

    /* *********************************************************** *
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    * *********************************************************** */

    /* ***********************************************************
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
   		return true;
    }
    ***********************************************************

     *********************************************************** */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                showAbout();
                return true;
            case R.id.help:
                showHelp();
                return true;
            default:
                return false;
        }
    }
    /* *********************************************************** */


    /* *********************************************************** */
    private void showAbout() {
        AlertDialog.Builder	about = new AlertDialog.Builder(this);
        about.setTitle(
                Html.fromHtml(
                        "<b>INTELLIGENT WORKOUT</b>")
        );
        about.setIcon(R.drawable.ic_about);

        TextView l_viewabout	= new TextView(this);
        l_viewabout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        l_viewabout.setPadding(20, 10, 20, 10);
        l_viewabout.setTextSize(20);
        l_viewabout.setText(
                Html.fromHtml(
                        "<small>PROJET ANDROID : Intelligent Workout</small>"+
                                "<br/>"+"<br/>"+
                                "<b>Developper par:</b>"+
                                "<br/>"+
                                "<small>- AGHILAS ADJAOUDI</small>"+  "<br/>"+
                                "<small>- MASSINISSA ARKOUN</small>"+
                                "<br/>"+"<br/>"+
                                "<small>PARIS 8 MIME<br/><a href=\"http://www.univ-paris8.fr\">univ-paris8.fr</a></small>"+
                                "<br/>"
                )
        );

        about.setView(l_viewabout);
        about.setPositiveButton(
                "OK",
                new android.content.DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }
        );

        about.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                                      @Override
                                      public void onCancel(DialogInterface dialog) {

                                      }
                                  }
        );

        about.show();
    }


    /* *********************************************************** */
    private void showHelp() {
        AlertDialog.Builder	help = new AlertDialog.Builder(this);

        //TextView l_viewhelp	= new TextView(this);


        help.setTitle(
                Html.fromHtml(
                        "<b>Projet Memory</b>")
        );
        help.setIcon(R.drawable.ic_help);
        help.setMessage(
                Html.fromHtml(
                        "<b><u>Règles:</u></b>"+
                                "<br/>"+
                                "<small>Intelligent workout est un jeu celebre que tous le monde a jouer aumoins une fois dans sa vie. c'est une forme de casse tete qui prent la forme d'un cube ou on vous donne une image au dessus que vous devez esseyer de reproduire en deplaçant les cases pour enfin former le meme motif que celui donné avec les cases rouge.</small>"+
                                "<br/>"+"<br/>"
                )
        );

        help.setPositiveButton(
                "OK",
                new android.content.DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }
        );

        help.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                                     @Override
                                     public void onCancel(DialogInterface dialog) {

                                     }
                                 }
        );

        help.show();
    }
    /* *********************************************************** */

}

