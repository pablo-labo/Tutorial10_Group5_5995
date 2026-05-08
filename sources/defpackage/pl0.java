package defpackage;

import android.webkit.WebSettings;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.jsmappservices.bridge.ToastTheme;
import defpackage.wle;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pl0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ pl0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws NoSuchFieldException {
        switch (this.a) {
            case 0:
                sl0 sl0Var = sl0.a;
                return WebSettings.getDefaultUserAgent(sl0.m());
            case 1:
                DisplayToastData.Companion companion = DisplayToastData.INSTANCE;
                return ToastTheme.Companion.serializer();
            case 2:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                return new iu2(yd8VarB, new KSerializer[0]);
            case 3:
                return new rna("com.indeed.android.messaging.ui.inbox.InboxRoute", b57.INSTANCE, new Annotation[0]);
            case 4:
                jte jteVar = gi7.a;
                return Boolean.TRUE;
            case 5:
                return new gt0(ni1.a, 0);
            case 6:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 7:
                return xnd.Companion.serializer();
            case 8:
                return db8.b;
            case DatadogLogGenerator.CRASH /* 9 */:
                epa epaVar = epa.a;
                return epa.a().a();
            case 10:
                return j6g.a;
            case 11:
                m2c.c(pjb.d);
                return j6g.a;
            case 12:
                Field declaredField = noc.class.getDeclaredField("a");
                declaredField.setAccessible(true);
                return declaredField;
            default:
                qme qmeVar = new qme(new bj(10));
                wle.e.getClass();
                qmeVar.h = wle.a.d(qmeVar.d);
                return qmeVar;
        }
    }
}
