package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class oze extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.a;
            Method method = this.b;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                l5.r(e);
                return false;
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public m7 z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, oze.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            oze ozeVar = oze.this;
            Context context = ozeVar.c;
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.y != null) {
                if (context.isRestricted()) {
                    r6.g("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                if (ozeVar.d == null) {
                    ozeVar.d = oze.a(context);
                }
                Object obj = ozeVar.d;
                String str = this.y;
                a aVar = new a();
                aVar.a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.b = cls.getMethod(str, a.c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e) {
                    StringBuilder sbM = akb.m("Couldn't resolve menu item onClick handler ", str, " in class ");
                    sbM.append(cls.getName());
                    InflateException inflateException = new InflateException(sbM.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).f(true);
                } else if (menuItem instanceof fo9) {
                    fo9 fo9Var = (fo9) menuItem;
                    pze pzeVar = fo9Var.d;
                    try {
                        if (fo9Var.e == null) {
                            fo9Var.e = pzeVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        fo9Var.e.invoke(pzeVar, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, oze.e, ozeVar.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            m7 m7Var = this.z;
            if (m7Var != null) {
                if (menuItem instanceof pze) {
                    ((pze) menuItem).a(m7Var);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z2 = menuItem instanceof pze;
            if (z2) {
                ((pze) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z2) {
                ((pze) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((pze) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((pze) menuItem).setNumericShortcut(c2, i4);
            } else {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((pze) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z2) {
                    ((pze) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public oze(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    b0.o("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                b0.o("Unexpected end of document");
                return;
            }
            Menu menu2 = bVar.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                m7 m7Var = bVar.z;
                                if (m7Var == null || !m7Var.a()) {
                                    bVar.h = true;
                                    bVar.b(menu2.add(bVar.b, bVar.i, bVar.j, bVar.k));
                                } else {
                                    bVar.h = true;
                                    bVar.b(menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wac.p);
                        bVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        bVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        bVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        bVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        bVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wac.q);
                            bVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            bVar.j = (typedArrayObtainStyledAttributes2.getInt(5, bVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, bVar.d) & 65535);
                            bVar.k = typedArrayObtainStyledAttributes2.getText(7);
                            bVar.l = typedArrayObtainStyledAttributes2.getText(8);
                            bVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            bVar.n = string == null ? (char) 0 : string.charAt(0);
                            bVar.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            bVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                bVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.r = bVar.e;
                            }
                            bVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            bVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, bVar.f);
                            bVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, bVar.g);
                            bVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            bVar.y = typedArrayObtainStyledAttributes2.getString(12);
                            bVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            bVar.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && bVar.w == 0 && bVar.x == null) {
                                bVar.z = (m7) bVar.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.z = null;
                            }
                            bVar.A = typedArrayObtainStyledAttributes2.getText(17);
                            bVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                bVar.D = ac4.c(typedArrayObtainStyledAttributes2.getInt(19, -1), bVar.D);
                            } else {
                                bVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = pnb.z(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.C = colorStateList;
                            } else {
                                bVar.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            bVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.h = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                            bVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof nze)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof f) {
                    f fVar = (f) menu;
                    if (!fVar.p) {
                        fVar.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((f) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((f) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
