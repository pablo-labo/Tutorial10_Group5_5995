package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import defpackage.cj1;
import defpackage.fxa;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ikc extends qj0 {
    public static final QwertyKeyListener G0;
    public fxa A0;
    public vse B0;
    public boolean C0;
    public EventDispatcher D0;
    public b E0;
    public String F0;
    public final InputMethodManager V;
    public final String W;
    public boolean a0;
    public final int b0;
    public final int c0;
    public int d0;
    public CopyOnWriteArrayList<TextWatcher> e0;
    public int f0;
    public boolean g0;
    public String h0;
    public List<String> i0;
    public boolean j0;
    public r4e k0;
    public ht2 l0;
    public dsd m0;
    public a n0;
    public boolean o0;
    public boolean p0;
    public final rcf q0;
    public boolean r0;
    public String s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public String z0;

    public static final class a implements KeyListener {
        public int a;

        @Override // android.text.method.KeyListener
        public final void clearMetaKeyState(View view, Editable editable, int i) {
            view.getClass();
            editable.getClass();
            ikc.G0.clearMetaKeyState(view, editable, i);
        }

        @Override // android.text.method.KeyListener
        public final int getInputType() {
            return this.a;
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            view.getClass();
            editable.getClass();
            keyEvent.getClass();
            return ikc.G0.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            view.getClass();
            editable.getClass();
            keyEvent.getClass();
            return ikc.G0.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            view.getClass();
            editable.getClass();
            keyEvent.getClass();
            return ikc.G0.onKeyUp(view, editable, i, keyEvent);
        }
    }

    public final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList;
            editable.getClass();
            ikc ikcVar = ikc.this;
            if (ikcVar.a0 || (copyOnWriteArrayList = ikcVar.e0) == null) {
                return;
            }
            Iterator<TextWatcher> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList;
            charSequence.getClass();
            ikc ikcVar = ikc.this;
            if (ikcVar.a0 || (copyOnWriteArrayList = ikcVar.e0) == null) {
                return;
            }
            Iterator<TextWatcher> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList;
            charSequence.getClass();
            QwertyKeyListener qwertyKeyListener = ikc.G0;
            ikc ikcVar = ikc.this;
            if (!ikcVar.a0 && (copyOnWriteArrayList = ikcVar.e0) != null) {
                Iterator<TextWatcher> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().onTextChanged(charSequence, i, i2, i3);
                }
            }
            ikcVar.k();
            ikcVar.h();
        }
    }

    static {
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        instanceForFullKeyboard.getClass();
        G0 = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikc(mkf mkfVar) {
        super(mkfVar, null);
        mkfVar.getClass();
        this.W = ikc.class.getSimpleName();
        this.t0 = -1;
        this.u0 = -1;
        this.A0 = fxa.b;
        Object systemService = mkfVar.getSystemService("input_method");
        systemService.getClass();
        this.V = (InputMethodManager) systemService;
        this.b0 = getGravity() & 8388615;
        this.c0 = getGravity() & 112;
        this.d0 = 0;
        this.a0 = false;
        this.j0 = false;
        this.e0 = null;
        this.f0 = getInputType();
        if (this.n0 == null) {
            this.n0 = new a();
        }
        this.m0 = null;
        this.q0 = new rcf();
        b();
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, null);
        }
        epg.o(this, new kkc(this, isFocusable(), getImportantForAccessibility()));
        jkc jkcVar = new jkc(this);
        setCustomSelectionActionModeCallback(jkcVar);
        setCustomInsertionActionModeCallback(jkcVar);
    }

    private final b getTextWatcherDelegator() {
        if (this.E0 == null) {
            this.E0 = new b();
        }
        return this.E0;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        textWatcher.getClass();
        if (this.e0 == null) {
            this.e0 = new CopyOnWriteArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.e0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(textWatcher);
        }
    }

    public final void b() {
        rcf rcfVar = this.q0;
        setTextSize(0, rcfVar.a());
        float fB = rcfVar.b();
        if (Float.isNaN(fB)) {
            return;
        }
        setLetterSpacing(fB);
    }

    public final int c(int i) {
        int length = 0;
        if (getText() != null) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return 0;
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(i, length));
    }

    public final void d() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            clearFocus();
        } else {
            View rootView = getRootView();
            rootView.getClass();
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        this.V.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final boolean e() {
        return (getInputType() & 131072) != 0;
    }

    public final void f(int i, int i2) {
        if (i == -1 || i2 == -1) {
            return;
        }
        super.setSelection(c(i), c(i2));
    }

    @SuppressLint({"ClassImplementsFinalize"})
    public final void finalize() {
        lif lifVar = lif.a;
        int id = getId();
        lifVar.getClass();
        lif.c.remove(Integer.valueOf(id));
    }

    public final void g(npc npcVar) {
        rcf rcfVar;
        boolean z;
        if ((getInputType() & 144) == 0 || !wl7.b(getText(), npcVar.a)) {
            int i = npcVar.b;
            Spannable spannable = npcVar.a;
            if (i >= this.d0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                Editable text = getText();
                if (text == null) {
                    r6.g("Required value was null.");
                    return;
                }
                boolean z2 = false;
                Object[] spans = text.getSpans(0, length(), Object.class);
                int length = spans.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Object obj = spans[i2];
                    int spanFlags = text.getSpanFlags(obj);
                    boolean z3 = (spanFlags & 33) != 33 ? z2 : true;
                    if (obj instanceof moc) {
                        text.removeSpan(obj);
                    }
                    if (z3) {
                        int spanStart = text.getSpanStart(obj);
                        int spanEnd = text.getSpanEnd(obj);
                        text.removeSpan(obj);
                        if (spanStart <= spannableStringBuilder.length() && spanEnd <= spannableStringBuilder.length()) {
                            int i3 = spanStart;
                            while (true) {
                                if (i3 >= spanEnd) {
                                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                                    break;
                                } else if (text.charAt(i3) != spannableStringBuilder.charAt(i3)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    i2++;
                    z2 = false;
                }
                ct0 ct0VarQ = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactAbsoluteSizeSpan.class));
                while (true) {
                    boolean zHasNext = ct0VarQ.hasNext();
                    rcfVar = this.q0;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = ct0VarQ.next();
                    ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) next;
                    reactAbsoluteSizeSpan.getClass();
                    if (reactAbsoluteSizeSpan.getSize() == rcfVar.a()) {
                        spannableStringBuilder.removeSpan(next);
                    }
                }
                ct0 ct0VarQ2 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactBackgroundColorSpan.class));
                while (ct0VarQ2.hasNext()) {
                    Object next2 = ct0VarQ2.next();
                    ReactBackgroundColorSpan reactBackgroundColorSpan = (ReactBackgroundColorSpan) next2;
                    reactBackgroundColorSpan.getClass();
                    int backgroundColor = reactBackgroundColorSpan.getBackgroundColor();
                    Integer numG = v71.g(this);
                    if (numG != null && backgroundColor == numG.intValue()) {
                        spannableStringBuilder.removeSpan(next2);
                    }
                }
                ct0 ct0VarQ3 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactForegroundColorSpan.class));
                while (ct0VarQ3.hasNext()) {
                    Object next3 = ct0VarQ3.next();
                    ReactForegroundColorSpan reactForegroundColorSpan = (ReactForegroundColorSpan) next3;
                    reactForegroundColorSpan.getClass();
                    if (reactForegroundColorSpan.getForegroundColor() == getCurrentTextColor()) {
                        spannableStringBuilder.removeSpan(next3);
                    }
                }
                ct0 ct0VarQ4 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactStrikethroughSpan.class));
                while (ct0VarQ4.hasNext()) {
                    Object next4 = ct0VarQ4.next();
                    if ((getPaintFlags() & 16) != 0) {
                        spannableStringBuilder.removeSpan(next4);
                    }
                }
                ct0 ct0VarQ5 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactUnderlineSpan.class));
                while (ct0VarQ5.hasNext()) {
                    Object next5 = ct0VarQ5.next();
                    if ((getPaintFlags() & 8) != 0) {
                        spannableStringBuilder.removeSpan(next5);
                    }
                }
                ct0 ct0VarQ6 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sa3.class));
                while (ct0VarQ6.hasNext()) {
                    Object next6 = ct0VarQ6.next();
                    sa3 sa3Var = (sa3) next6;
                    sa3Var.getClass();
                    if (sa3Var.a == rcfVar.b()) {
                        spannableStringBuilder.removeSpan(next6);
                    }
                }
                ct0 ct0VarQ7 = web.q(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sb3.class));
                while (ct0VarQ7.hasNext()) {
                    Object next7 = ct0VarQ7.next();
                    sb3 sb3Var = (sb3) next7;
                    sb3Var.getClass();
                    int i4 = sb3Var.a;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    if (i4 == this.u0 && wl7.b(sb3Var.d, this.s0)) {
                        int i5 = sb3Var.b;
                        if (i5 == -1) {
                            i5 = DataOkHttpUploader.HTTP_BAD_REQUEST;
                        }
                        if (i5 == this.t0 && wl7.b(sb3Var.c, getFontFeatureSettings())) {
                            spannableStringBuilder.removeSpan(next7);
                        }
                    }
                }
                this.g0 = npcVar.c;
                this.C0 = true;
                if (spannable.length() == 0) {
                    setText((CharSequence) null);
                    z = false;
                } else {
                    Editable text2 = getText();
                    if (text2 == null) {
                        r6.g("Required value was null.");
                        return;
                    } else {
                        z = false;
                        text2.replace(0, length(), spannableStringBuilder);
                    }
                }
                this.C0 = z;
                int breakStrategy = getBreakStrategy();
                int i6 = npcVar.i;
                if (breakStrategy != i6) {
                    setBreakStrategy(i6);
                }
                k();
            }
        }
    }

    public final boolean getContainsImages() {
        return this.g0;
    }

    public final boolean getDisableFullscreenUI() {
        return this.j0;
    }

    public final boolean getDisableTextDiffing$ReactAndroid_release() {
        return this.C0;
    }

    public final List<String> getDragAndDropFilter() {
        return this.i0;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    public final int getNativeEventCount() {
        return this.d0;
    }

    public final String getReturnKeyType() {
        return this.F0;
    }

    public final int getStagedInputType() {
        return this.f0;
    }

    public final vse getStateWrapper() {
        return this.B0;
    }

    public final String getSubmitBehavior() {
        return this.h0;
    }

    public final void h() {
        ht2 ht2Var = this.l0;
        if (ht2Var != null) {
            ht2Var.a();
        }
        ReactContext reactContextF = dmc.f(this);
        if (this.B0 != null || reactContextF.isBridgeless()) {
            return;
        }
        cpc cpcVar = new cpc(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextF.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), cpcVar);
        }
    }

    public final boolean i() {
        boolean zRequestFocus = requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            this.V.showSoftInput(this, 0);
        }
        return zRequestFocus;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return;
            }
            ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
            while (ct0VarQ.hasNext()) {
                if (((phf) ct0VarQ.next()).a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public final boolean isLayoutRequested() {
        return false;
    }

    public final boolean j() {
        String str = this.h0;
        return str == null ? !e() : str.equals("submit") || str.equals("blurAndSubmit");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikc.k():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void l() {
        String str = this.F0;
        int i = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i = 7;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i = 3;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i = 2;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i = 5;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        i = 1;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i = 4;
                    }
                    break;
            }
        }
        if (this.j0) {
            i |= 33554432;
        }
        setImeOptions(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        setTextIsSelectable(true);
        f(selectionStart, selectionEnd);
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return;
            } else {
                ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
                while (ct0VarQ.hasNext()) {
                    ((phf) ct0VarQ.next()).c();
                }
            }
        }
        if (this.v0 && !this.x0) {
            i();
        }
        this.x0 = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        qmc qmcVar = ie7.g0;
        if (qmcVar.enableBridgelessArchitecture() && qmcVar.enableFontScaleChangesUpdatingLayout()) {
            b();
        }
    }

    @Override // defpackage.qj0, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        ReactContext reactContextF = dmc.f(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.p0) {
            EventDispatcher eventDispatcher = this.D0;
            if (eventDispatcher == null) {
                r6.g("Required value was null.");
                return null;
            }
            inputConnectionOnCreateInputConnection = new lkc((rq4) inputConnectionOnCreateInputConnection, reactContextF, this, eventDispatcher);
        }
        if (e()) {
            String str = this.h0;
            if ((str == null ? !e() : str.equals("blurAndSubmit")) || j()) {
                editorInfo.imeOptions &= -1073741825;
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // defpackage.qj0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return;
            }
            ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
            while (ct0VarQ.hasNext()) {
                ((phf) ct0VarQ.next()).d();
            }
        }
    }

    @Override // defpackage.qj0, android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        dragEvent.getClass();
        List<String> list = this.i0;
        if (list != null && dragEvent.getAction() == 1) {
            List<String> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (dragEvent.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.A0 != fxa.b) {
            v71.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return;
            }
            ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
            while (ct0VarQ.hasNext()) {
                ((phf) ct0VarQ.next()).e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        r4e r4eVar;
        super.onFocusChanged(z, i, rect);
        if (!z || (r4eVar = this.k0) == null || r4eVar == null) {
            return;
        }
        r4eVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 66 || e()) {
            return super.onKeyUp(i, keyEvent);
        }
        this.V.hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h();
        if (this.y0 && isFocused()) {
            selectAll();
            this.y0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        dsd dsdVar = this.m0;
        if (dsdVar != null) {
            dsdVar.a(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        r4e r4eVar;
        super.onSelectionChanged(i, i2);
        if (this.k0 == null || !hasFocus() || (r4eVar = this.k0) == null) {
            return;
        }
        r4eVar.a(i, i2);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return;
            }
            ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
            while (ct0VarQ.hasNext()) {
                ((phf) ct0VarQ.next()).f();
            }
        }
    }

    @Override // defpackage.qj0, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            i = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.o0) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.o0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        textWatcher.getClass();
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.e0;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(textWatcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.e0 = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void setAllowFontScaling(boolean z) {
        rcf rcfVar = this.q0;
        if (rcfVar.a != z) {
            rcfVar.a = z;
            b();
        }
    }

    public final void setAutoFocus(boolean z) {
        this.v0 = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        v71.j(this, Integer.valueOf(i));
    }

    public final void setBorderRadius(float f) {
        v71.m(this, (zi1) zi1.c.get(0), Float.isNaN(f) ? null : new ou8(nn2.C(f), pu8.a));
    }

    public final void setBorderStyle(String str) {
        cj1 cj1VarA;
        if (str == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(str);
        }
        v71.n(this, cj1VarA);
    }

    public final void setContainsImages(boolean z) {
        this.g0 = z;
    }

    public final void setContentSizeWatcher(ht2 ht2Var) {
        this.l0 = ht2Var;
    }

    public final void setContextMenuHidden(boolean z) {
        this.w0 = z;
    }

    public final void setDisableFullscreenUI(boolean z) {
        this.j0 = z;
        l();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z) {
        this.C0 = z;
    }

    public final void setDragAndDropFilter(List<String> list) {
        this.i0 = list;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.D0 = eventDispatcher;
    }

    public final void setFontFamily(String str) {
        this.s0 = str;
        this.r0 = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (wl7.b(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.r0 = true;
    }

    public final void setFontSize(float f) {
        this.q0.b = f;
        b();
    }

    public final void setFontStyle(String str) {
        int iB = qpc.b(str);
        if (iB != this.u0) {
            this.u0 = iB;
            this.r0 = true;
        }
    }

    public final void setFontWeight(String str) {
        int iD = qpc.d(str);
        if (iD != this.t0) {
            this.t0 = iD;
            this.r0 = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i) {
        if (i == 0) {
            i = this.b0;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i) {
        if (i == 0) {
            i = this.c0;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = getTypeface();
        super.setInputType(i);
        this.f0 = i;
        setTypeface(typeface);
        if (e()) {
            setSingleLine(false);
        }
        if (this.n0 == null) {
            this.n0 = new a();
        }
        a aVar = this.n0;
        if (aVar != null) {
            aVar.a = i;
        }
        super.setKeyListener(aVar);
    }

    public final void setLetterSpacingPt(float f) {
        this.q0.d = f;
        b();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        this.q0.c = i;
    }

    public final void setMaxFontSizeMultiplier(float f) {
        rcf rcfVar = this.q0;
        if (f == rcfVar.g) {
            return;
        }
        rcfVar.e(f);
        b();
    }

    public final void setNativeEventCount(int i) {
        this.d0 = i;
    }

    public final void setOnKeyPress(boolean z) {
        this.p0 = z;
    }

    public final void setOverflow(String str) {
        fxa fxaVar = fxa.b;
        if (str == null) {
            this.A0 = fxaVar;
        } else {
            fxa.a.getClass();
            fxa fxaVarA = fxa.a.a(str);
            if (fxaVarA != null) {
                fxaVar = fxaVarA;
            }
            this.A0 = fxaVar;
        }
        invalidate();
    }

    public final void setPlaceholder(String str) {
        if (wl7.b(str, this.z0)) {
            return;
        }
        this.z0 = str;
        setHint(str);
    }

    public final void setReturnKeyType(String str) {
        this.F0 = str;
        l();
    }

    public final void setScrollWatcher(dsd dsdVar) {
        this.m0 = dsdVar;
    }

    public final void setSelectTextOnFocus(boolean z) {
        setSelectAllOnFocus(z);
        this.y0 = z;
    }

    public final void setSelectionWatcher$ReactAndroid_release(r4e r4eVar) {
        this.k0 = r4eVar;
    }

    public final void setSettingTextFromJS(boolean z) {
        this.a0 = z;
    }

    public final void setSettingTextFromState(boolean z) {
    }

    public final void setStagedInputType(int i) {
        this.f0 = i;
    }

    public final void setStateWrapper(vse vseVar) {
        this.B0 = vseVar;
    }

    public final void setSubmitBehavior(String str) {
        this.h0 = str;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        drawable.getClass();
        if (this.g0) {
            Editable text = getText();
            if (text == null) {
                r6.g("Required value was null.");
                return false;
            }
            ct0 ct0VarQ = web.q((phf[]) text.getSpans(0, text.length(), phf.class));
            while (ct0VarQ.hasNext()) {
                if (((phf) ct0VarQ.next()).a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
