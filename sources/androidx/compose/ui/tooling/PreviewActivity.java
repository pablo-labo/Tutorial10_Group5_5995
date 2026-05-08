package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import defpackage.a7e;
import defpackage.ah2;
import defpackage.eg2;
import defpackage.lmb;
import defpackage.lx6;
import defpackage.mmb;
import defpackage.r6;
import defpackage.r6e;
import defpackage.ri8;
import defpackage.smb;
import defpackage.t92;
import defpackage.u63;
import defpackage.wea;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewActivity extends ComponentActivity {
    public final String j0 = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        Object[] array;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.j0;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strR0 = zve.r0(stringExtra, JwtParser.SEPARATOR_CHAR);
        String strO0 = zve.o0(JwtParser.SEPARATOR_CHAR, stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strO0 + "' without a parameter provider.");
            eg2.a(this, new ah2(-840626948, new lx6(1, strR0, strO0), true));
            return;
        }
        Log.d(str, "Previewing '" + strO0 + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 < length) {
                        Constructor<?> constructor2 = constructors[i2];
                        if (constructor2.getParameterTypes().length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor = constructor2;
                        }
                        i2++;
                    } else if (!z) {
                    }
                }
                constructor = null;
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                objNewInstance.getClass();
                smb smbVar = (smb) objNewInstance;
                if (intExtra < 0) {
                    r6e r6eVarA = smbVar.a();
                    int count = smbVar.getCount();
                    Iterator it = r6eVarA.iterator();
                    array = new Object[count];
                    for (int i3 = 0; i3 < count; i3++) {
                        array[i3] = it.next();
                    }
                } else {
                    List listZ = u63.Z(a7e.R(smbVar.a(), intExtra));
                    ArrayList arrayList = new ArrayList(t92.r0(listZ, 10));
                    Iterator it2 = listZ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(wea.l(it2.next()));
                    }
                    array = arrayList.toArray(new Object[0]);
                }
            } catch (ri8 unused) {
                r6.g("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                return;
            }
        } else {
            array = new Object[0];
        }
        if (array.length > 1) {
            eg2.a(this, new ah2(-861939235, new lmb(strR0, strO0, array), true));
        } else {
            eg2.a(this, new ah2(-1901447514, new mmb(strR0, strO0, array), true));
        }
    }
}
