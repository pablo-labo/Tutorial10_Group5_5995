package defpackage;

import android.util.Log;
import com.datadog.android.Datadog;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class pub {
    public static final a b = new a();
    public static volatile pub c;
    public boolean a;

    public static final class a {
        public final pub a() {
            pub pubVar;
            pub pubVar2 = pub.c;
            if (pubVar2 != null) {
                return pubVar2;
            }
            synchronized (this) {
                pubVar = pub.c;
                if (pubVar == null) {
                    pubVar = new pub();
                    pub.c = pubVar;
                }
            }
            return pubVar;
        }
    }

    public final void a() {
        ArrayList arrayList = lz2.a;
        Log.d("ProfileRUM", "🔄 DEBUG: notifyViewChange called, resetting hasEmittedErrorForView from " + this.a + " to false", null);
        this.a = false;
        Log.d("ProfileRUM", "✨ DEBUG: Error tracking state reset - ready for new view session", null);
    }

    public final void b(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("ProfileRUM", "🔍 DEBUG: triggerError called with message: '" + str + "', hasEmittedErrorForView: " + this.a, null);
        if (this.a) {
            Log.d("ProfileRUM", "🔄 DEBUG: Error already emitted for this view session, skipping duplicate", null);
            return;
        }
        this.a = true;
        Log.d("ProfileRUM", "⚡ DEBUG: Setting hasEmittedErrorForView = true, attempting to send to Datadog", null);
        try {
            if (!c0h.C()) {
                Log.d("ProfileRUM", "⚠️ DEBUG: Datadog not enabled, view-level error not sent", null);
                return;
            }
            GlobalRumMonitor.get(Datadog.getInstance("dd-jsma")).addError("Native view contained error: ".concat(str), RumErrorSource.CUSTOM, null, kc9.W(new Pair("pageSuccess", Boolean.FALSE)));
            Log.d("ProfileRUM", "✅ DEBUG: View-level error successfully sent to Datadog: 'Native view contained error: " + str + "'", null);
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            Log.d("ProfileRUM", "❌ DEBUG: View-level error sending failed: " + e.getMessage(), null);
        }
    }
}
