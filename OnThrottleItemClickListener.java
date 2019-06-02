
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

public abstract class OnThrottleItemClickListener implements AdapterView.OnItemClickListener {

    private static final long THROTTLE_TIME = 500; // milliseconds

    private long lastClickTime = 0;
    public abstract void onThrottleItemClick(final AdapterView<?> parent, final View view, final int position, final long id);

    @Override
    public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {
        final long clickTime = SystemClock.elapsedRealtime();
        if (clickTime - lastClickTime < THROTTLE_TIME) {
            return;
        }
        lastClickTime = clickTime;
        onThrottleItemClick(parent, view, position, id);
    }
}
