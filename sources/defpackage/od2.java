package defpackage;

import android.util.Log;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.et7;
import defpackage.ph8;
import expo.modules.video.records.VideoSource;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od2 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ od2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ld2 ld2Var = (ld2) obj;
                ld2Var.getClass();
                ld2Var.a.getClass();
                return true;
            case 1:
                ((String) obj).getClass();
                return j6g.a;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case 3:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.i(s5eVar2, 0);
                return j6g.a;
            case 4:
                ((m74) obj).getClass();
                return new fz(3);
            case 5:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.c(s5eVar3);
                return j6g.a;
            case 6:
                JSTBroadcastEvent.FormCompleted formCompleted = (JSTBroadcastEvent.FormCompleted) obj;
                formCompleted.getClass();
                return Boolean.valueOf(wl7.b(formCompleted.getFormName(), "profileForm"));
            case 7:
                String str = (String) obj;
                hvb hvbVar = hvb.a0;
                if (str == null || zve.U(str)) {
                    m2c.a(hvbVar);
                } else {
                    m2c.b(hvbVar, str);
                }
                return j6g.a;
            case 8:
                ph8.b bVar = (ph8.b) obj;
                bVar.a = 1800;
                bVar.a(Float.valueOf(0.0f), 1267).b = c3c.d;
                bVar.a(Float.valueOf(1.0f), 1800);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", "POST_APPLY");
                return j6g.a;
            case 10:
                obj.getClass();
                String str2 = (String) obj;
                ubb.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (wl7.b(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new a19(localeForLanguageTag);
            case 11:
                et7 et7Var = (et7) obj;
                et7Var.getClass();
                if (!(et7Var instanceof et7.b)) {
                    if (et7Var instanceof et7.a) {
                        ArrayList arrayList = lz2.a;
                        throw null;
                    }
                    l.g();
                    return null;
                }
                ArrayList arrayList2 = lz2.a;
                Log.d("TareDebugFragment", "Push Primer Success: " + ((et7.b) et7Var).a, null);
                return j6g.a;
            case 12:
                de0 de0Var = (de0) obj;
                int iRound = Math.round(de0Var.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(de0Var.b);
                return new th7((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            default:
                return VideoSource.toMediaId$lambda$1((String) obj);
        }
    }
}
