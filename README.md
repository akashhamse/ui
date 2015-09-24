<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    android:layout_weightSum="5"
    >

    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:weightSum="4"
        android:id="@+id/rowOne"
        android:layout_weight="1">

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/clear"
            android:id="@+id/button1"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#FF0000"
            android:textSize="23dp"
            android:layout_margin="2dp"
            android:onClick="funcClear"
            />

        <EditText
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="2"
            android:background="#ffffff"
            android:layout_margin="2dp"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/backSpace"
            android:id="@+id/button2"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#FF0000"
            android:textSize="23dp"
            android:layout_margin="2dp"
            android:onClick="funcDel"/>


    </LinearLayout>



    <!-- row two -->
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:weightSum="4"
        android:id="@+id/rowTwo"
        android:layout_below="@+id/rowOne"
        android:layout_weight="1">

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/one"
            android:id="@+id/button3"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcOne"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/two"
            android:id="@+id/button4"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcTwo"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/three"
            android:id="@+id/button5"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcThree"/>

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/div"
            android:id="@+id/button6"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#00BFFF"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcDiv"/>


    </LinearLayout>


    <!-- row three -->

    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:weightSum="4"
        android:id="@+id/rowThree"
        android:layout_below="@+id/rowTwo"
        android:layout_weight="1">

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/four"
            android:id="@+id/button7"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcFour"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/five"
            android:id="@+id/button8"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcFive"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/six"
            android:id="@+id/button9"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcSix"/>

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/mul"
            android:id="@+id/button10"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#00BFFF"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcMul"/>


    </LinearLayout>





    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:weightSum="4"
        android:id="@+id/rowFour"
        android:layout_below="@+id/rowThree"
        android:layout_weight="1">

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/seven"
            android:id="@+id/button11"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcSeven"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/eight"
            android:id="@+id/button12"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcEight"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/nine"
            android:id="@+id/button13"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcNine"/>

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/sub"
            android:id="@+id/button14"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#00BFFF"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcSub"/>


    </LinearLayout>





    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:weightSum="4"
        android:id="@+id/rowFive"
        android:layout_below="@+id/rowFour"
        android:layout_weight="1">

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/zero"
            android:id="@+id/button15"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#696969"
            android:layout_gravity="center"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcZero"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="."
            android:id="@+id/button16"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:layout_gravity="center"
            android:background="#00BFFF"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcDot"/>
        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/equal"
            android:id="@+id/button17"
            android:layout_weight="1"
            android:background="#7CFC00"
            android:layout_gravity="center"
            android:textColor="#ffffff"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcEquals"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="112dp"
            android:text="@string/add"
            android:id="@+id/button18"
            android:layout_gravity="center"
            android:layout_weight="1"
            android:textColor="#ffffff"
            android:background="#00BFFF"
            android:textSize="40dp"
            android:layout_margin="2dp"
            android:onClick="funcAdd"/>


    </LinearLayout>


</RelativeLayout>
