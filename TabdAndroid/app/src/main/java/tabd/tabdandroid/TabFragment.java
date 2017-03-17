package tabd.tabdandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxwellicus on 1/26/2017.
 */

public class TabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/

        Uri tab = Uri.parse("http://www.google.com");
        Intent openTabIntent = new Intent(Intent.ACTION_VIEW, tab);
        startActivity(openTabIntent);

        return inflater.inflate(R.layout.fragment_tab, container,false);
    }
}
