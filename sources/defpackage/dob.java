package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dob implements yu5 {
    @Override // defpackage.yu5
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kjf kjfVar = (kjf) obj5;
        String string = ((CharSequence) obj4).subSequence(kjf.f(kjfVar.a), kjf.e(kjfVar.a)).toString();
        Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
        ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
        Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((Context) obj).startActivity(className);
        return j6g.a;
    }
}
