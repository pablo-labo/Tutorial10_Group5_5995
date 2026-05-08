package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.s;
import defpackage.akb;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import defpackage.tac;
import defpackage.v6e;
import defpackage.w20;
import defpackage.wl7;
import defpackage.wve;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@s.b("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/a;", "Landroidx/navigation/s;", "Landroidx/navigation/a$a;", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a extends s<C0068a> {
    public final Context c;
    public final Activity d;

    /* JADX INFO: renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static class C0068a extends k {
        public Intent a0;
        public String b0;

        public C0068a() {
            throw null;
        }

        public static String l(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            packageName.getClass();
            return wve.I(str, "${applicationId}", packageName);
        }

        @Override // androidx.navigation.k
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof C0068a) && super.equals(obj)) {
                Intent intent = this.a0;
                if ((intent != null ? intent.filterEquals(((C0068a) obj).a0) : ((C0068a) obj).a0 == null) && wl7.b(this.b0, ((C0068a) obj).b0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.k
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.a0;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.b0;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.k
        public final void i(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.i(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, tac.a);
            typedArrayObtainAttributes.getClass();
            String strL = l(context, typedArrayObtainAttributes.getString(4));
            if (this.a0 == null) {
                this.a0 = new Intent();
            }
            Intent intent = this.a0;
            intent.getClass();
            intent.setPackage(strL);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                ComponentName componentName = new ComponentName(context, string);
                if (this.a0 == null) {
                    this.a0 = new Intent();
                }
                Intent intent2 = this.a0;
                intent2.getClass();
                intent2.setComponent(componentName);
            }
            String string2 = typedArrayObtainAttributes.getString(1);
            if (this.a0 == null) {
                this.a0 = new Intent();
            }
            Intent intent3 = this.a0;
            intent3.getClass();
            intent3.setAction(string2);
            String strL2 = l(context, typedArrayObtainAttributes.getString(2));
            if (strL2 != null) {
                Uri uri = Uri.parse(strL2);
                if (this.a0 == null) {
                    this.a0 = new Intent();
                }
                Intent intent4 = this.a0;
                intent4.getClass();
                intent4.setData(uri);
            }
            this.b0 = l(context, typedArrayObtainAttributes.getString(3));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.k
        public final String toString() {
            Intent intent = this.a0;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.a0;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            return sb.toString();
        }
    }

    public static final class b implements s.a {
    }

    public static final class c extends mj8 implements Function1<Context, Context> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        Object next;
        context.getClass();
        this.c = context;
        Iterator it = v6e.O(context, c.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
    }

    @Override // androidx.navigation.s
    public final k a() {
        return new C0068a(this);
    }

    @Override // androidx.navigation.s
    public final k c(k kVar, Bundle bundle, p pVar, s.a aVar) {
        Intent intent;
        int intExtra;
        C0068a c0068a = (C0068a) kVar;
        if (c0068a.a0 == null) {
            akb.n(w20.k(new StringBuilder("Destination "), c0068a.W, " does not have an Intent set."));
            return null;
        }
        Intent intent2 = new Intent(c0068a.a0);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c0068a.b0;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        t40.o("Could not find ", strGroup, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map mapG0 = lc9.g0(c0068a.V);
                    strGroup.getClass();
                    androidx.navigation.b bVar = (androidx.navigation.b) mapG0.get(strGroup);
                    r<Object> rVar = bVar != null ? bVar.a : null;
                    stringBuffer.append(rVar != null ? rVar.f(rVar.a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar instanceof b;
        if (z) {
            intent2.addFlags(0);
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (pVar != null && pVar.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0068a.W);
        Context context = this.c;
        Resources resources = context.getResources();
        if (pVar != null) {
            int i = pVar.h;
            int i2 = pVar.i;
            if ((i <= 0 || !wl7.b(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !wl7.b(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + c0068a);
            }
        }
        if (z) {
            context.startActivity(intent2);
        } else {
            context.startActivity(intent2);
        }
        if (pVar != null && activity != null) {
            int i3 = pVar.f;
            int i4 = pVar.g;
            if ((i3 > 0 && wl7.b(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && wl7.b(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + c0068a);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // androidx.navigation.s
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
