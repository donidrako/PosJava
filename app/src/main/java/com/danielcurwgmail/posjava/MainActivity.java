package com.danielcurwgmail.posjava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private TextView textViewLabel;
        private Button connectButton;
        private Spinner comboBoxComm;
        private TextView label1;
        private TextView label2;
        private EditText editTextAmount;
        private Button buttonSale;
        private TextView label3;
        private EditText editTextVoid;
        private Button buttonVoid;
        private EditText textBoxRequest;
        private TextView label4;
        private TextView label11;
        private TextView label10;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Inicializar los elementos de la interfaz aquí y configurar los listeners de eventos si es necesario
            comboBoxComm = findViewById(R.id.comboBoxComm);
            textBoxRAmount = findViewById(R.id.editTextAmount);
            textBoxRResponseCode = findViewById(R.id.textBoxRResponseCode);
            textBoxRResponseText = findViewById(R.id.textBoxRResponseText);
            textBoxRTerminalid = findViewById(R.id.textBoxRTerminalid);
            textBoxRInvoiceNumber = findViewById(R.id.textBoxRInvoiceNumber);
            textBoxRTransactionID = findViewById(R.id.textBoxRTransactionID);
            textBoxRCardType = findViewById(R.id.textBoxRCardType);
            textBoxAccountType = findViewById(R.id.textBoxAccountType);
            textBoxRBatchNo = findViewById(R.id.textBoxRBatchNo);
            textBoxRApprovalCode = findViewById(R.id.textBoxRApprovalCode);
            textBoxRTransactionDate = findViewById(R.id.textBoxRTransactionDate);
            textBoxRRawMSG = findViewById(R.id.textBoxRRawMSG);
            textBoxMerchantID = findViewById(R.id.textBoxMerchantID);
            textBoxLabel = findViewById(R.id.textBoxLabel);
            textBoxAID = findViewById(R.id.textBoxAID);
            textBoxCardHolderName = findViewById(R.id.textBoxCardHolderName);

            comboBoxComm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                    String selectedPort = parentView.getItemAtPosition(position).toString();
                    Toast.makeText(MainActivity.this, "Puerto seleccionado: " + selectedPort, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {

                }
            });


        }

        public void AppendTextBox(ResponseDTO responseDTO) {

            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                }
            });
        }

        private void cleanBox() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textBoxRAmount.setText("");
                    textBoxRResponseCode.setText("");
                    textBoxRResponseText.setText("");
                    textBoxRTerminalid.setText("");
                    textBoxRInvoiceNumber.setText("");
                    textBoxRTransactionID.setText("");
                    textBoxRCardType.setText("");
                    textBoxAccountType.setText("");
                    textBoxRBatchNo.setText("");
                    textBoxRApprovalCode.setText("");
                    textBoxRTransactionDate.setText("");
                    textBoxRRawMSG.setText("");
                }
            });
        }

        private void label2_Click(View view) {

        }

        private void label3_Click(View view) {

        }

        private void AddInsetUSBHandler() {
        }

        private void AddRemoveUSBHandler() {

        }

        class USBDeviceInfo {

        }



    Logger log = LogManager.GetCurrentClassLogger();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Llamada sa buttonConnect_Click
        buttonConnect_Click(null);
    }

    private void buttonConnect_Click(View view) {
        log.Info("conectar click");


        UsbManager usbManager = (UsbManager) getSystemService(Context.USB_SERVICE);


        HashMap<String, UsbDevice> usbDevices = usbManager.getDeviceList();

        for (UsbDevice usbDevice : usbDevices.values()) {
            log.Info("Availability :%d," +
                            "Caption:%s," +
                            "ClassCode:%s," +
                            "ConfigManagerErrorCode:%s," +
                            "ConfigManagerUserConfig:%s," +
                            "CreationClassName:%s," +
                            "CurrentAlternateSettings:%d," +
                            "CurrentConfigValue:%d," +
                            "Description:%s," +
                            "DeviceID:%s," +
                            "ErrorCleared:%s," +
                            "ErrorDescription:%s," +
                            "GangSwitched:%d," +
                            "InstallDate:%s," +
                            "LastErrorCode:%s," +
                            "Name:%s," +
                            "NumberOfConfigs:%d," +
                            "NumberOfPorts:%d," +
                            "PNPDeviceID:%s," +
                            "PowerManagementCapabilities:%s," +
                            "PowerManagementSupported:%b," +
                            "ProtocolCode:%d," +
                            "Status:%s," +
                            "StatusInfo:%s," +
                            "SubclassCode:%d," +
                            "SystemCreationClassName:%s," +
                            "SystemName:%s," +
                            "USBVersion:%s",
                    usbDevice.getDeviceId(), usbDevice.getProductName(), usbDevice.getDeviceClass(),
                    usbDevice.getDeviceId(), usbDevice.getDeviceId(), usbDevice.getDeviceId(),
                    usbDevice.getDeviceProtocol(), usbDevice.getDeviceSubclass(), usbDevice.getProductName(),
                    usbDevice.getDeviceId(), usbDevice.getDeviceId(), usbDevice.getDeviceId(),
                    usbDevice.getInterfaceCount(), usbDevice.getDeviceId(), usbDevice.getDeviceId(),
                    usbDevice.getDeviceId(), usbDevice.getConfigurationCount(), usbDevice.getEndpointCount(),
                    usbDevice.getSerialNumber(), usbDevice.getPowerSupply(), usbDevice.getPowerCapabilities(),
                    usbDevice.getDeviceProtocol(), usbDevice.getStatus(), usbDevice.getStatus(),
                    usbDevice.getDeviceSubclass(), usbDevice.getDeviceId(), usbDevice.getDeviceId(),
                    usbDevice.getVersion());
        }
    }
}


