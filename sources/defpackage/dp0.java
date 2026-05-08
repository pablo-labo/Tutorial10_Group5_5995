package defpackage;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.locationselector.CountryConfig;
import com.indeed.android.jobsearch.locationselector.a;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.jq7;
import defpackage.rn0;
import defpackage.xh8;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dp0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ dp0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                return new gt0(rn0.a.a, 0);
            case 1:
                return new rna("com.indeed.android.messaging.ui.preview.AttachmentUploadPreviewRoute", vw0.INSTANCE, new Annotation[0]);
            case 2:
                ra8 ra8VarA = sa8.a(new md1(1));
                xh8 xh8Var = a.a;
                InputStream inputStreamOpenRawResource = ((Context) (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getResources().openRawResource(R.raw.change_country_language);
                inputStreamOpenRawResource.getClass();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, a32.b);
                try {
                    String strY = nn2.y(inputStreamReader);
                    inputStreamReader.close();
                    KSerializer<CountryConfig> kSerializerSerializer = CountryConfig.INSTANCE.serializer();
                    kSerializerSerializer.getClass();
                    List<CountryConfig> list = (List) ra8VarA.c(new gt0(kSerializerSerializer, 0), strY);
                    hb9 hb9Var = new hb9();
                    for (CountryConfig countryConfig : list) {
                        hb9Var.put(countryConfig.a, countryConfig.b);
                    }
                    return hb9Var.j();
                } finally {
                }
            case 3:
                return EventRecord.AttachmentSentStatus._init_$_anonymous_();
            case 4:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                return new iu2(yd8VarB, new KSerializer[0]);
            case 5:
                return wy0.a;
            case 6:
                return new gt0(ni1.a, 0);
            case 7:
                return new rna("CookiePolicy", jq7.g.INSTANCE, new Annotation[0]);
            case 8:
                return aq3.Companion.serializer();
            case DatadogLogGenerator.CRASH /* 9 */:
                return new by8(mve.a, na8.a);
            case 10:
                return ua8.b;
            case 11:
                epa epaVar = epa.a;
                return epa.a().a();
            case 12:
                m2c.c(pjb.f);
                return j6g.a;
            default:
                return j6g.a;
        }
    }
}
