package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.widget.PopupMenu;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class ro9 extends tpc {
    public final GestureDetector V;
    public final ReactContext a;
    public ReadableArray b;
    public boolean c;
    public final PopupMenu d;
    public boolean e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro9(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        this.a = mkfVar;
        this.d = new PopupMenu(getContext(), this);
        this.V = new GestureDetector(mkfVar, new qo9(this));
    }

    public static SpannableStringBuilder g(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    private final int getGetActionsCount() {
        ReadableArray readableArray = this.b;
        if (readableArray != null) {
            return readableArray.size();
        }
        wl7.g("mActions");
        throw null;
    }

    private final void setMHitSlopRect(Rect rect) {
        super.setHitSlopRect(rect);
        setMHitSlopRect(rect);
        post(new xn0(this, 6));
    }

    public final void h() {
        int i;
        if (getGetActionsCount() > 0) {
            PopupMenu popupMenu = this.d;
            popupMenu.getMenu().clear();
            boolean z = this.c;
            if (z) {
                i = 5;
            } else {
                if (z) {
                    l.g();
                    return;
                }
                i = 3;
            }
            popupMenu.setGravity(i);
            if (Build.VERSION.SDK_INT >= 29) {
                popupMenu.setForceShowIcon(true);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < getGetActionsCount(); i3++) {
                ReadableArray readableArray = this.b;
                if (readableArray == null) {
                    wl7.g("mActions");
                    throw null;
                }
                if (!readableArray.isNull(i3)) {
                    ReadableArray readableArray2 = this.b;
                    if (readableArray2 == null) {
                        wl7.g("mActions");
                        throw null;
                    }
                    ReadableMap map = readableArray2.getMap(i3);
                    MenuItem menuItemAdd = (map == null || !map.hasKey("subactions") || map.isNull("subactions")) ? popupMenu.getMenu().add(0, 0, i3, map != null ? map.getString("title") : null) : popupMenu.getMenu().addSubMenu(0, 0, i3, map.getString("title")).getItem();
                    menuItemAdd.getClass();
                    i(menuItemAdd, map);
                    menuItemAdd.setOnMenuItemClickListener(new no9(this, i2));
                }
            }
            popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: oo9
                @Override // android.widget.PopupMenu.OnDismissListener
                public final void onDismiss(PopupMenu popupMenu2) {
                    ro9 ro9Var = this.a;
                    ro9Var.e = false;
                    EventDispatcher eventDispatcherE = dmc.e(ro9Var.a, ro9Var.getId());
                    int iH = dmc.h(ro9Var);
                    if (eventDispatcherE != null) {
                        int id = ro9Var.getId();
                        ro9Var.getId();
                        eventDispatcherE.a(new pc4(iH, id, 1));
                    }
                }
            });
            this.e = true;
            EventDispatcher eventDispatcherE = dmc.e(this.a, getId());
            int iH = dmc.h(this);
            if (eventDispatcherE != null) {
                int id = getId();
                getId();
                eventDispatcherE.a(new ho9(iH, id));
            }
            popupMenu.show();
        }
    }

    public final void i(MenuItem menuItem, ReadableMap readableMap) {
        Integer numValueOf = (readableMap == null || !readableMap.hasKey("titleColor") || readableMap.isNull("titleColor")) ? null : Integer.valueOf(readableMap.getInt("titleColor"));
        String string = (readableMap == null || !readableMap.hasKey("image") || readableMap.isNull("image")) ? null : readableMap.getString("image");
        Integer numValueOf2 = (readableMap == null || !readableMap.hasKey("imageColor") || readableMap.isNull("imageColor")) ? null : Integer.valueOf(readableMap.getInt("imageColor"));
        ReadableMap map = (readableMap == null || !readableMap.hasKey(RumFeature.EVENT_ATTRIBUTES_PROPERTY) || readableMap.isNull(RumFeature.EVENT_ATTRIBUTES_PROPERTY)) ? null : readableMap.getMap(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        final ReadableArray array = (readableMap == null || !readableMap.hasKey("subactions") || readableMap.isNull("subactions")) ? null : readableMap.getArray("subactions");
        String string2 = readableMap != null ? readableMap.getString("state") : null;
        if (numValueOf != null) {
            menuItem.setTitle(g(numValueOf.intValue(), String.valueOf(menuItem.getTitle())));
        }
        if (string != null) {
            Resources resources = getContext().getResources();
            resources.getClass();
            int identifier = resources.getIdentifier(string, "drawable", getContext().getPackageName());
            if (identifier == 0) {
                try {
                    Field declaredField = R.drawable.class.getDeclaredField(string);
                    declaredField.getClass();
                    identifier = declaredField.getInt(declaredField);
                } catch (Exception e) {
                    e.printStackTrace();
                    identifier = 0;
                }
            }
            if (identifier != 0) {
                Drawable drawable = getResources().getDrawable(identifier, getContext().getTheme());
                if (numValueOf2 != null) {
                    drawable.setTintList(ColorStateList.valueOf(numValueOf2.intValue()));
                }
                menuItem.setIcon(drawable);
            }
        }
        if (map != null) {
            menuItem.setEnabled(!((!map.hasKey("disabled") || map.isNull("disabled")) ? false : map.getBoolean("disabled")));
            if (!menuItem.isEnabled()) {
                menuItem.setTitle(g(2005436552, String.valueOf(menuItem.getTitle())));
                if (string != null) {
                    Drawable icon = menuItem.getIcon();
                    if (icon != null) {
                        icon.setTintList(ColorStateList.valueOf(2005436552));
                    }
                    menuItem.setIcon(icon);
                }
            }
            menuItem.setVisible(!((!map.hasKey("hidden") || map.isNull("hidden")) ? false : map.getBoolean("hidden")));
            if ((!map.hasKey("destructive") || map.isNull("destructive")) ? false : map.getBoolean("destructive")) {
                menuItem.setTitle(g(-65536, String.valueOf(menuItem.getTitle())));
                if (string != null) {
                    Drawable icon2 = menuItem.getIcon();
                    if (icon2 != null) {
                        icon2.setTintList(ColorStateList.valueOf(-65536));
                    }
                    menuItem.setIcon(icon2);
                }
            }
        }
        if (wl7.b(string2, "on") || wl7.b(string2, "off")) {
            menuItem.setCheckable(true);
            menuItem.setChecked(wl7.b(string2, "on"));
        } else {
            menuItem.setCheckable(false);
        }
        if (array == null || !menuItem.hasSubMenu()) {
            return;
        }
        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (!array.isNull(i)) {
                ReadableMap map2 = array.getMap(i);
                SubMenu subMenu = menuItem.getSubMenu();
                MenuItem menuItemAdd = subMenu != null ? subMenu.add(0, 0, i, map2 != null ? map2.getString("title") : null) : null;
                if (menuItemAdd != null) {
                    i(menuItemAdd, map2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: po9
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem2) {
                            menuItem2.getClass();
                            if (menuItem2.hasSubMenu()) {
                                return false;
                            }
                            ro9 ro9Var = this.a;
                            ro9Var.e = false;
                            int order = menuItem2.getOrder();
                            ReadableArray readableArray = array;
                            if (readableArray.isNull(order)) {
                                return true;
                            }
                            ReadableMap map3 = readableArray.getMap(menuItem2.getOrder());
                            EventDispatcher eventDispatcherE = dmc.e(ro9Var.a, ro9Var.getId());
                            int iH = dmc.h(ro9Var);
                            if (eventDispatcherE == null) {
                                return true;
                            }
                            eventDispatcherE.a(new io9(map3 != null ? map3.getString("id") : null, iH, ro9Var.getId(), ro9Var.getId()));
                            return true;
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new xn0(this, 6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e) {
            this.d.dismiss();
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }

    @Override // defpackage.tpc, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new xn0(this, 6));
    }

    @Override // defpackage.tpc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.V.onTouchEvent(motionEvent);
        return true;
    }

    public final void setActions(ReadableArray readableArray) {
        readableArray.getClass();
        this.b = readableArray;
    }

    public final void setIsAnchoredToRight(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
    }

    public final void setIsOpenOnLongPress(boolean z) {
        this.f = z;
    }
}
