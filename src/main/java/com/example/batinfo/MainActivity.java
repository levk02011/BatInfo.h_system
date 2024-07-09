public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("jni.h"); // ������������ ���� �������� JNI
    }

    public native int getBatteryLevel(); // ���������� ��������� ������

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int batteryLevel = getBatteryLevel();
        Log.d("BatteryInfo", "Battery Level: " + batteryLevel + "%");
    }
}
