package run.java.com.javarunprogram.android.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import run.java.com.javarunprogram.R;
import run.java.com.javarunprogram.android.fragments.FragmentFour;
import run.java.com.javarunprogram.android.fragments.FragmentOne;
import run.java.com.javarunprogram.android.fragments.FragmentThree;
import run.java.com.javarunprogram.android.fragments.FragmentTwo;


public class LauncherActivity extends Activity {

    ArrayList<String> items = new ArrayList<>();
    private Button addButton, replaceButton, addReplaceButton;
    private FrameLayout addFrameLayout, replaceFrameLayout, addReplaceFrameLayout;

    private static int FRAGMENT_ADD_POSITION = 0, FRAGMENT_REPLACE_POSITION = 0, FRAGMENT_ADD_REPLACE_POSITION = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        items.add("ttttt");
        items.add("hkhkhkh");
        // initializeActivity();
        saveFile();

    }


    private void saveFile() {

        File file = new File(getFilesDir(), "text");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            File gpxfile = new File(file, "sample");
            FileWriter writer = new FileWriter(gpxfile);
            writer.append("ggjdwkdhwkdwhdwhkwhkwhkwhkw");
            writer.flush();
            writer.close();
            System.out.println("SAve--------");
        } catch (Exception e) {
        }

    }


    private void initializeActivity() {

        addButton = (Button) findViewById(R.id.add_button);
        replaceButton = (Button) findViewById(R.id.replace_button);
        addReplaceButton = (Button) findViewById(R.id.add_replace_button);

        addFrameLayout = (FrameLayout) findViewById(R.id.add_container);
        replaceFrameLayout = (FrameLayout) findViewById(R.id.replace_container);
        addReplaceFrameLayout = (FrameLayout) findViewById(R.id.add_replace_container);

        /**
         *
         * Below is implementation of 3 button ADD fragment REPLACE fragment and
         * ADD & REPLACE fragment addButton : Launching new fragment with "add"
         * function.
         * replaceButton : Launching new fragment with "replace"
         * function.
         * addReplaceButton : Launching new fragment with "add" function three time and last one with "replace" function.
         *
         * NOTE : We have created transparent background for every
         * fragment layout so that we can check what happen to previous fragment when
         * new fragment is launch in different cases.
         *
         **/

        /**
         *
         * Launching new fragment with "add" function.
         *
         * According to documentation when we launch new fragment with 'add' function
         * previous fragment will remain in same condition...no lifecycle method will be called for previous fragment
         * -Thats why when we launch new fragment...previous fragment is still visible in background.
         *
         * similarly when we pop-back previous fragment...current fragment will be destroy by calling lifecycle method
         * ...but previous fragment won't call any lifecycle method.
         *
         **/
        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                boolean addToBackStack = true;
                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction fragmentOneTransaction = getFragmentManager().beginTransaction();

                switch (FRAGMENT_ADD_POSITION) {
                    case 0:
                        FRAGMENT_ADD_POSITION++;
                        fragmentOneTransaction.add(R.id.add_container, new FragmentOne());
                        break;
                    case 1:
                        FRAGMENT_ADD_POSITION++;
                        fragmentOneTransaction.add(R.id.add_container, new FragmentTwo());
                        break;
                    case 2:
                        FRAGMENT_ADD_POSITION++;
                        fragmentOneTransaction.add(R.id.add_container, new FragmentThree());
                        break;
                    case 3:
                        FRAGMENT_ADD_POSITION++;
                        fragmentOneTransaction.add(R.id.add_container, new FragmentFour());
                        break;
                    default:
                        addToBackStack = false;
                        break;
                }

                if (addToBackStack) {
                    fragmentOneTransaction.addToBackStack(null);
                    fragmentOneTransaction.commit();
                }
            }
        });

        /**
         *
         * Launching new fragment with "replace" function.
         *
         * According to documentation when we launch fragment with 'replace' function all previous fragment will be replace and new fragment will be launch.
         * IT DOESN'T WORK IN SUCH A WAY WHEN WE HAVE LAUNCHED MULTIPLE FRAGMENT...AS IT DOESN'T REPLACE ALL FRAGMENT IN CONTAINER.(DEPEND ON ANDROID VERSION)
         * NOTE : "Please read comment of third example('addReplaceButton') for more detail."
         *
         * In below example we are launching every fragment with 'replace' function thats why it is working properly and disabling it's previous view by calling
         * -onPause
         * -onStop
         * -onDestroyView
         * It works properly because in this case it has to replace only one fragment at a time.
         *
         * But it will behave unexpectedly when we launch multiple fragment and now calling launching fragment with 'replace' function.
         * NOTE : "Please read comment of third example('addReplaceButton') for more detail."
         **/
        replaceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                boolean addToBackStack = true;

                FragmentTransaction fragmentOneTransaction = getFragmentManager().beginTransaction();

                switch (FRAGMENT_REPLACE_POSITION) {
                    case 0:
                        FRAGMENT_REPLACE_POSITION++;
                        fragmentOneTransaction.replace(R.id.replace_container, new FragmentOne());
                        break;
                    case 1:
                        FRAGMENT_REPLACE_POSITION++;
                        fragmentOneTransaction.replace(R.id.replace_container, new FragmentTwo());
                        break;
                    case 2:
                        FRAGMENT_REPLACE_POSITION++;
                        fragmentOneTransaction.replace(R.id.replace_container, new FragmentThree());
                        break;
                    case 3:
                        FRAGMENT_REPLACE_POSITION++;
                        fragmentOneTransaction.replace(R.id.replace_container, new FragmentFour());
                        break;
                    default:
                        addToBackStack = false;
                        break;
                }

                if (addToBackStack) {
                    fragmentOneTransaction.addToBackStack(null);
                    fragmentOneTransaction.commit();
                }
            }
        });

        /**
         *
         * Launching new fragment with "add" and "replace" function combination.
         *
         * In below example we are trying two scenario...
         *
         * FIRST :
         * 		 Call three fragment with 'add' function and call last one with 'replace' function.
         *
         * EXCEPECTED BEHAVIOR : According to documentation it should disable all the three previous fragment
         * but it doesn't behave in that way and disable only FIRST and THIRD fragment by calling below lifecycle method.
         * WHICH IS COMPLETELY UNEXCEPECTED(THIS HAPPEN IN OLDER ANDROID VERSION)
         *
         FragmentOne  : onPause
         FragmentOne  : onStop
         FragmentOne  : onDestroyView

         FragmentThree: onPause
         FragmentThree: onStop
         FragmentThree: onDestroyView

         FragmentFour : onAttach
         FragmentFour : onCreate
         FragmentFour : onCreateView
         FragmentFour : onViewCreated
         FragmentFour : onActivityCreated
         FragmentFour : onStart
         FragmentFour : onResume

         SECOND :(For trying second scenario uncomment 'replace' line in "case 1" and comment "add" line)
         Calling "add" and "replace" function alternatively.
         *
         * For first three click it works fine
         * First Click(add function)      : Added new fragment in container
         * Second Click(replace function) : Disable previous fragment and launched new fragment
         * Third Click(add Function)      : Added new fragment without disturbing previous fragment
         * 	ABOVE SCENARIO IS EXCEPECTED AND IT IS WORKING FINE.
         *
         * On Fourth Click it behave unexpectedly
         * Fourth Click(replace function) : Disable only second fragment and launches fourth fragment by calling below lifecycle method
         *
         FragmentTwo : onPause
         FragmentTwo : onStop
         FragmentTwo : onDestroyView

         FragmentFour: onAttach
         FragmentFour: onCreate
         FragmentFour: onCreateView
         FragmentFour: onViewCreated
         FragmentFour: onActivityCreated
         FragmentFour: onStart
         FragmentFour: onResume

         NOTE : Third fragment is still visible ...which is unexpected behavior.
         *
         **/
        addReplaceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                boolean addToBackStack = true;

                FragmentTransaction fragmentOneTransaction = getFragmentManager().beginTransaction();

                switch (FRAGMENT_ADD_REPLACE_POSITION) {
                    case 0:
                        FRAGMENT_ADD_REPLACE_POSITION++;
                        fragmentOneTransaction.add(R.id.add_replace_container, new FragmentOne());
                        break;
                    case 1:
                        FRAGMENT_ADD_REPLACE_POSITION++;
                        fragmentOneTransaction.add(R.id.add_replace_container, new FragmentTwo());
//					fragmentOneTransaction.replace(R.id.add_replace_container, new FragmentTwo());
                        break;
                    case 2:
                        FRAGMENT_ADD_REPLACE_POSITION++;
                        fragmentOneTransaction.add(R.id.add_replace_container, new FragmentThree());
                        break;
                    case 3:
                        FRAGMENT_ADD_REPLACE_POSITION++;
                        fragmentOneTransaction.replace(R.id.add_replace_container, new FragmentFour());
                        break;
                    default:
                        addToBackStack = false;
                        break;
                }

                if (addToBackStack) {
                    fragmentOneTransaction.addToBackStack(null);
                    fragmentOneTransaction.commit();
                }
            }
        });


        /********** ********************************************************
         * ////////////////////////////////////////////////////////////////
         *
         * Remember "addToBackStack" is completely independent from ADD and REPLACE function.
         *
         * ADD function will only add fragment in container(and make it invisible inside container)  it will not add it in back stack...
         * if we want to maintain it in back stack we have to call "addToBackStack" on "FragmentTransaction" object.
         *
         * REPLACE function will only replace previous fragment in its container it won't remove or add fragment entry in back stack.
         * if we want to maintain it in back stack we have to call "addToBackStack" on "FragmentTransaction" object.
         *
         * If you have called "addToBackStack" on "FragmentTransaction" object then it will be available in back stack
         * whether you have called 'ADD' or 'REPLACE' for launching fragment.
         *
         * ////////////////////////////////////////////////////////////////
         ******************************************************************/
    }

    /**
     * By default back button will not go back to previous fragment...it will
     * work normally and go back to previous activity ...in case we want to go
     * back to previous fragment then we have to pop back previous fragment on
     * back press.
     */
    @Override
    public void onBackPressed() {
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            fm.popBackStack();
            if (fm.getBackStackEntryCount() == 1) {
                FRAGMENT_ADD_POSITION = 0;
                FRAGMENT_REPLACE_POSITION = 0;
                FRAGMENT_ADD_REPLACE_POSITION = 0;
            }
        } else {
            super.onBackPressed();
        }
    }
}
