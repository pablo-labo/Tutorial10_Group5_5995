package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ek0 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final jfe<String, Constructor<? extends View>> h = new jfe<>();
    public final Object[] a = new Object[2];

    public static class a implements View.OnClickListener {
        public final View a;
        public final String b;
        public Method c;
        public Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.c == null) {
                View view2 = this.a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.b;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        StringBuilder sbM = akb.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        sbM.append(view2.getClass());
                        sbM.append(str);
                        throw new IllegalStateException(sbM.toString());
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.c = method;
                            this.d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                ja.m("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                ja.m("Could not execute method for android:onClick", e2);
            }
        }
    }

    public aj0 a(Context context, AttributeSet attributeSet) {
        return new aj0(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public cj0 c(Context context, AttributeSet attributeSet) {
        return new cj0(context, attributeSet);
    }

    public wj0 d(Context context, AttributeSet attributeSet) {
        return new wj0(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        jfe<String, Constructor<? extends View>> jfeVar = h;
        Constructor<? extends View> constructor = jfeVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            jfeVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }
}
