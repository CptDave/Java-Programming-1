public void playAI(){

        //WARNING
        //IF THESE RADIO BUTTONS BOTH = radio_intermediate THEN ANDROID STUDIO WILL CRASH
        //WARNING
        //RadioButton radioButtonInt = (RadioButton) findViewById(R.id.radio_intermediate);
        //RadioButton radioButtonIm = (RadioButton) findViewById(R.id.radio_impossible);

        //Advanced logic. Fall through moves based on priority
        TextView[] tv = returnTextView();

        //Intermediate difficulty
        if (!difficultyIntermediate) {
            //ADVANCED AI
            //
            //OFFENSIVE AI
            //
            //Split Pair
            //Left and Right
            if (tv[0].getText().toString().equals("O") && tv[2].getText().toString().equals("O") &&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            else if (tv[3].getText().toString().equals("O") && tv[5].getText().toString().equals("O") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            else if (tv[6].getText().toString().equals("O") && tv[8].getText().toString().equals("O") &&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            //Top and Bottom
            else if (tv[0].getText().toString().equals("O") && tv[6].getText().toString().equals("O") &&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            else if (tv[1].getText().toString().equals("O") && tv[7].getText().toString().equals("O") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            else if (tv[2].getText().toString().equals("O") && tv[8].getText().toString().equals("O") &&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            //ADJACENT
            //Left to right
            else if (tv[0].getText().toString().equals("O") && tv[1].getText().toString().equals("O") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            else if (tv[3].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            else if (tv[6].getText().toString().equals("O") && tv[7].getText().toString().equals("O") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //Right ro Left
            else if (tv[1].getText().toString().equals("O") && tv[2].getText().toString().equals("O") &&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            else if (tv[4].getText().toString().equals("O") && tv[5].getText().toString().equals("O") &&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            else if (tv[8].getText().toString().equals("O") && tv[7].getText().toString().equals("O") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //Top to Bottom
            else if (tv[0].getText().toString().equals("O") && tv[3].getText().toString().equals("O") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            else if (tv[1].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            else if (tv[2].getText().toString().equals("O") && tv[5].getText().toString().equals("O") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //Bottom to Top
            else if (tv[6].getText().toString().equals("O") && tv[3].getText().toString().equals("O") &&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            else if (tv[7].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            else if (tv[8].getText().toString().equals("O") && tv[5].getText().toString().equals("O") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //DIAGONAL
            //Top to Bottom
            else if (tv[0].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            else if (tv[2].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //Bottom to Top
            else if (tv[6].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            else if (tv[8].getText().toString().equals("O") && tv[4].getText().toString().equals("O") &&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //
            //DEFENSIVE AI
            //
            //1 and 3 go 2
            else if (tv[0].getText().toString().equals("X") && tv[2].getText().toString().equals("X") &&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            //if 1 and 7 fo 4
            else if (tv[0].getText().toString().equals("X") && tv[6].getText().toString().equals("X") &&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            //if 1 and 9 go 5
            else if (tv[0].getText().toString().equals("X") && tv[8].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 7 go 5
            else if (tv[2].getText().toString().equals("X") && tv[6].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 7 and 5 go 3
            else if (tv[6].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 9 and 6 go 3
            else if (tv[8].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 3 and 5 go 7
            else if (tv[2].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 2 and 8 go 5
            else if (tv[1].getText().toString().equals("X") && tv[7].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 9 go 6
            else if (tv[2].getText().toString().equals("X") && tv[8].getText().toString().equals("X") &&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            //if 4 and 6 go 5
            else if (tv[3].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 6 go 9
            else if (tv[2].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 1 and 2 go 3
            else if (tv[0].getText().toString().equals("X") && tv[1].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 1 and 4 go 7
            else if (tv[0].getText().toString().equals("X") && tv[3].getText().toString().equals("X") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 1 and 5 go 9
            else if (tv[0].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 2 and 3 go 1
            else if (tv[1].getText().toString().equals("X") && tv[2].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 4 and 7 go 1
            else if (tv[3].getText().toString().equals("X") && tv[6].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 5 and 9 go 1
            else if (tv[4].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 4 and 5 go 6
            else if (tv[3].getText().toString().equals("X") && tv[4].getText().toString().equals("X")&&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            //if 7 and 8 go 9
            else if (tv[6].getText().toString().equals("X") && tv[7].getText().toString().equals("X")&&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 5 and 6 go 4
            else if (tv[4].getText().toString().equals("X") && tv[5].getText().toString().equals("X")&&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            //if 8 and 9 go 7
            else if (tv[7].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 2 and 5 go 8
            else if (tv[1].getText().toString().equals("X") && tv[4].getText().toString().equals("X")&&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            //if 5 and 8 go 2
            else if (tv[4].getText().toString().equals("X") && tv[7].getText().toString().equals("X")&&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            //if 7 and 9 go 8
            else if (tv[6].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            //if 5 and 7 go 3
            else if (tv[4].getText().toString().equals("X") && tv[6].getText().toString().equals("X")&&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[7]);
            }


            } else if (!difficultyIntermediate) {

            if (tv[0].getText().toString().equals("X") && tv[2].getText().toString().equals("X") &&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            //if 1 and 7 fo 4
            else if (tv[0].getText().toString().equals("X") && tv[6].getText().toString().equals("X") &&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            //if 1 and 9 go 5
            else if (tv[0].getText().toString().equals("X") && tv[8].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 7 go 5
            else if (tv[2].getText().toString().equals("X") && tv[6].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 7 and 5 go 3
            else if (tv[6].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 9 and 6 go 3
            else if (tv[8].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 3 and 5 go 7
            else if (tv[2].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 2 and 8 go 5
            else if (tv[1].getText().toString().equals("X") && tv[7].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 9 go 6
            else if (tv[2].getText().toString().equals("X") && tv[8].getText().toString().equals("X") &&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            //if 4 and 6 go 5
            else if (tv[3].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[4]))
            {
                setTextColor(tv[4]);
            }
            //if 3 and 6 go 9
            else if (tv[2].getText().toString().equals("X") && tv[5].getText().toString().equals("X") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 1 and 2 go 3
            else if (tv[0].getText().toString().equals("X") && tv[1].getText().toString().equals("X") &&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[2]);
            }
            //if 1 and 4 go 7
            else if (tv[0].getText().toString().equals("X") && tv[3].getText().toString().equals("X") &&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 1 and 5 go 9
            else if (tv[0].getText().toString().equals("X") && tv[4].getText().toString().equals("X") &&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 2 and 3 go 1
            else if (tv[1].getText().toString().equals("X") && tv[2].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 4 and 7 go 1
            else if (tv[3].getText().toString().equals("X") && tv[6].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 5 and 9 go 1
            else if (tv[4].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[0]))
            {
                setTextColor(tv[0]);
            }
            //if 4 and 5 go 6
            else if (tv[3].getText().toString().equals("X") && tv[4].getText().toString().equals("X")&&
                    checkIfChecked(tv[5]))
            {
                setTextColor(tv[5]);
            }
            //if 7 and 8 go 9
            else if (tv[6].getText().toString().equals("X") && tv[7].getText().toString().equals("X")&&
                    checkIfChecked(tv[8]))
            {
                setTextColor(tv[8]);
            }
            //if 5 and 6 go 4
            else if (tv[4].getText().toString().equals("X") && tv[5].getText().toString().equals("X")&&
                    checkIfChecked(tv[3]))
            {
                setTextColor(tv[3]);
            }
            //if 8 and 9 go 7
            else if (tv[7].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[6]))
            {
                setTextColor(tv[6]);
            }
            //if 2 and 5 go 8
            else if (tv[1].getText().toString().equals("X") && tv[4].getText().toString().equals("X")&&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            //if 5 and 8 go 2
            else if (tv[4].getText().toString().equals("X") && tv[7].getText().toString().equals("X")&&
                    checkIfChecked(tv[1]))
            {
                setTextColor(tv[1]);
            }
            //if 7 and 9 go 8
            else if (tv[6].getText().toString().equals("X") && tv[8].getText().toString().equals("X")&&
                    checkIfChecked(tv[7]))
            {
                setTextColor(tv[7]);
            }
            //if 5 and 7 go 3
            else if (tv[4].getText().toString().equals("X") && tv[6].getText().toString().equals("X")&&
                    checkIfChecked(tv[2]))
            {
                setTextColor(tv[7]);
            }
            else {
                Random randomGen = new Random();
                int slot = randomGen.nextInt(8);

                switch (slot) {
                    case 0:
                        if (checkIfChecked(tv[0])) {
                            setTextColor(tv[0]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 1:

                        if (checkIfChecked((tv[1]))) {
                            setTextColor(tv[1]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 2:

                        if (checkIfChecked(tv[2])) {
                            setTextColor(tv[2]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 3:

                        if (checkIfChecked(tv[3])) {
                            setTextColor(tv[3]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 4:

                        if (checkIfChecked(tv[4])) {
                            setTextColor(tv[4]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 5:

                        if (checkIfChecked(tv[5])) {
                            setTextColor(tv[5]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 6:

                        if (checkIfChecked(tv[6])) {
                            setTextColor(tv[6]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 7:

                        if (checkIfChecked(tv[7])) {
                            setTextColor(tv[7]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                    case 8:

                        if (checkIfChecked(tv[8])) {
                            setTextColor(tv[8]);
                            if (checkWin("O")) {
                                showWin("O");
                            }
                        }else {
                            playAI();
                        }
                        break;
                }
            }

            if (checkWin("O")) {
                showWin("O");
            }
        }
    }
	
	
	
	
	
	
	
	<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.david.tictactoe" >

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher_custom"
        android:label="@string/app_name"
        android:theme="@android:style/Theme.Holo.Light">

        <activity
            android:name="com.example.david.tictactoe.MainActivity_Menu"
            android:label="@string/app_name" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
                <category android:name="android.intent.category.BROWSABLE" />
                <!-- Accepts URIs that begin with "http://www.example.com/gizmos” -->
                <data android:scheme="http"
                    android:host="www.example.com"
                    android:pathPrefix="/david" />
                <!-- note that the leading "/" is required for pathPrefix-->
                <!-- Accepts URIs that begin with "example://gizmos” -->
                <data android:scheme="example"
                    android:host="david" />

            </intent-filter>

        </activity>

        <activity
            android:name="com.example.david.tictactoe.activity_about"
            android:label="@string/app_name"
            android:parentActivityName=".MainActivity_Menu">
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />
                <!-- Accepts URIs that begin with "http://www.example.com/gizmos” -->
                <data android:scheme="http"
                    android:host="www.example.com"
                    android:pathPrefix="/david" />
                <!-- note that the leading "/" is required for pathPrefix-->
                <!-- Accepts URIs that begin with "example://gizmos” -->
                <data android:scheme="example"
                    android:host="david" />
            </intent-filter>
        </activity>

        <activity
            android:name="com.example.david.tictactoe.activity_settings"
            android:label="@string/app_name"
            android:parentActivityName=".MainActivity_Menu">
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />
                <!-- Accepts URIs that begin with "http://www.example.com/gizmos” -->
                <data android:scheme="http"
                    android:host="www.example.com"
                    android:pathPrefix="/david" />
                <!-- note that the leading "/" is required for pathPrefix-->
                <!-- Accepts URIs that begin with "example://gizmos” -->
                <data android:scheme="example"
                    android:host="david" />
            </intent-filter>
        </activity>

    </application>

</manifest>

	
	
	
	
	
	
	
	
	
	
	
	
	