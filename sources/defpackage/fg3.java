package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.projection.MediaProjectionManager;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import com.oney.WebRTCModule.e;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class fg3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public fg3(a aVar, String str) {
        this.c = aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                TextInputLayout textInputLayout = aVar.a;
                SimpleDateFormat simpleDateFormat = aVar.b;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), (String) obj2) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(ojg.e().getTimeInMillis()))));
                aVar.a();
                break;
            default:
                ((Activity) obj2).startActivityForResult(((MediaProjectionManager) obj).createScreenCaptureIntent(), e.h);
                break;
        }
    }

    public fg3(Activity activity, MediaProjectionManager mediaProjectionManager) {
        this.b = activity;
        this.c = mediaProjectionManager;
    }
}
