package defpackage;

import android.location.Address;
import android.location.Geocoder;
import com.indeed.android.jsmappservices.util.LocationSensor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jsmappservices.util.LocationSensor$getAddressesFromLocation$2", f = "LocationUtils.kt", l = {}, m = "invokeSuspend")
public final class c29 extends c1f implements Function2<e13, lu2<? super List<? extends Address>>, Object> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ e29 $source;
    int label;
    final /* synthetic */ LocationSensor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c29(LocationSensor locationSensor, double d, double d2, e29 e29Var, lu2<? super c29> lu2Var) {
        super(2, lu2Var);
        this.this$0 = locationSensor;
        this.$latitude = d;
        this.$longitude = d2;
        this.$source = e29Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new c29(this.this$0, this.$latitude, this.$longitude, this.$source, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super List<? extends Address>> lu2Var) {
        return ((c29) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zr4 zr4Var = zr4.a;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        try {
            List<Address> fromLocation = ((Geocoder) this.this$0.b.getValue()).getFromLocation(this.$latitude, this.$longitude, 5);
            return fromLocation == null ? zr4Var : fromLocation;
        } catch (IOException e) {
            int iOrdinal = this.$source.ordinal();
            String str = iOrdinal != 0 ? iOrdinal != 1 ? "location" : "last known location" : "current location";
            ArrayList arrayList = lz2.a;
            lz2.b("LocationUtils", "Android reverse geocoder failed to get addresses for ".concat(str), false, e);
            return zr4Var;
        }
    }
}
