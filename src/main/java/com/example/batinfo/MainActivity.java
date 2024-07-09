public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("jni.h"); // Завантаження вашої бібліотеки JNI
    }

    public native int getBatteryLevel(); // Оголошення нативного методу

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int batteryLevel = getBatteryLevel();
        Log.d("BatteryInfo", "Battery Level: " + batteryLevel + "%");
    }
}
