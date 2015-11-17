package mvcsample.isd.gorin.org.mvcsample.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import mvcsample.isd.gorin.org.mvcsample.R;
import mvcsample.isd.gorin.org.mvcsample.controller.ControllerBuilder;
import mvcsample.isd.gorin.org.mvcsample.controller.SampleController;


public class MainActivity extends Activity {

    private SampleController m_controller;
    private EditText m_editName;
    private EditText m_editHobby;
    private EditText m_editId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_controller = ControllerBuilder.getInstance();
        m_editName = (EditText)findViewById(R.id.editName);
        m_editHobby = (EditText)findViewById(R.id.editHobby);
        m_editId = (EditText)findViewById(R.id.editId);
    }

    /**
     * Addボタン押下時のハンドラ
     * */
    public void onClickAdd(View view){
        Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();

        if(m_controller != null) {
            m_controller.addMember(m_editName.getText().toString(), m_editHobby.getText().toString());
        }
    }

    /**
     * Refボタン押下時のハンドラ
     * */
    public void onClickRef(View view){
        if(m_controller != null){
            int totalMembers = m_controller.getTotalMemberCount();
            Toast.makeText(this, "Total = " + totalMembers, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Findボタン押下時のハンドラ
     * */
    public void onClickFind(View view){
        if(m_controller != null){
            int targetId = Integer.valueOf(m_editId.getText().toString());
            Toast.makeText(this, "Find Result:" + m_controller.getNameById(targetId), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
