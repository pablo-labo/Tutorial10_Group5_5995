package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.aj0;
import defpackage.aze;
import defpackage.epg;
import defpackage.f93;
import defpackage.g92;
import defpackage.pud;
import defpackage.qnf;
import defpackage.qud;
import defpackage.umf;
import defpackage.wac;
import defpackage.z3;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements g92 {
    public static final m Y0;
    public final Intent A0;
    public final CharSequence B0;
    public k C0;
    public j D0;
    public View.OnFocusChangeListener E0;
    public View.OnClickListener F0;
    public boolean G0;
    public boolean H0;
    public f93 I0;
    public boolean J0;
    public CharSequence K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public boolean O0;
    public String P0;
    public CharSequence Q0;
    public boolean R0;
    public int S0;
    public SearchableInfo T0;
    public Bundle U0;
    public final b V0;
    public final c W0;
    public final WeakHashMap<String, Drawable.ConstantState> X0;
    public final SearchAutoComplete h0;
    public final View i0;
    public final View j0;
    public final View k0;
    public final ImageView l0;
    public final ImageView m0;
    public final ImageView n0;
    public final ImageView o0;
    public final View p0;
    public n q0;
    public final Rect r0;
    public final Rect s0;
    public final int[] t0;
    public final int[] u0;
    public final ImageView v0;
    public final Drawable w0;
    public final int x0;
    public final int y0;
    public final Intent z0;

    public static class SearchAutoComplete extends aj0 {
        public boolean V;
        public final a W;
        public int e;
        public SearchView f;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.V) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.V = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.W = new a();
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                i.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m mVar = SearchView.Y0;
            mVar.getClass();
            m.a();
            Method method = mVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.aj0, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.V) {
                a aVar = this.W;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.x(searchView.H0);
            searchView.post(searchView.V0);
            if (searchView.h0.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.V = true;
                Context context = getContext();
                m mVar = SearchView.Y0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.W;
            if (!z) {
                this.V = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.V = true;
                    return;
                }
                this.V = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.h0.getText();
            searchView.Q0 = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.w(!zIsEmpty);
            int i4 = 8;
            if (searchView.O0 && !searchView.H0 && zIsEmpty) {
                searchView.m0.setVisibility(8);
                i4 = 0;
            }
            searchView.o0.setVisibility(i4);
            searchView.s();
            searchView.v();
            if (searchView.C0 != null && !TextUtils.equals(charSequence, searchView.P0)) {
                searchView.C0.a(charSequence.toString());
            }
            searchView.P0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.t();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f93 f93Var = SearchView.this.I0;
            if (f93Var instanceof aze) {
                f93Var.c(null);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            SearchAutoComplete searchAutoComplete = searchView.h0;
            if (view == searchView.l0) {
                searchView.x(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.F0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.n0) {
                searchView.m();
                return;
            }
            if (view == searchView.m0) {
                searchView.q();
                return;
            }
            if (view != searchView.o0) {
                if (view == searchAutoComplete) {
                    searchView.l();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.T0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.k(searchView.A0, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.z0);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class e implements View.OnKeyListener {
        public e() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            SearchAutoComplete searchAutoComplete = searchView.h0;
            if (searchView.T0 != null) {
                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                    if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                        view.cancelLongPress();
                        searchView.getContext().startActivity(searchView.j(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                        return true;
                    }
                } else if (searchView.T0 != null && searchView.I0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i == 66 || i == 84 || i == 61) {
                        searchView.n(searchAutoComplete.getListSelection());
                        return true;
                    }
                    if (i == 21 || i == 22) {
                        searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        searchAutoComplete.a();
                        return true;
                    }
                    if (i == 19) {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public class f implements TextView.OnEditorActionListener {
        public f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    public class g implements AdapterView.OnItemClickListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.n(i);
        }
    }

    public class h implements AdapterView.OnItemSelectedListener {
        public h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.o(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class i {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface j {
        boolean b();
    }

    public interface k {
        void a(String str);

        void b(String str);
    }

    public interface l {
    }

    public static class m {
        public Method a;
        public Method b;
        public Method c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class n extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public n(View view, Rect rect, Rect rect2) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.a = view;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.c;
            View view = this.a;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        m mVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            m mVar2 = new m();
            mVar2.a = null;
            mVar2.b = null;
            mVar2.c = null;
            m.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                mVar2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                mVar2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                mVar2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            mVar = mVar2;
        }
        Y0 = mVar;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.searchViewStyle);
        this.r0 = new Rect();
        this.s0 = new Rect();
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.V0 = new b();
        this.W0 = new c();
        this.X0 = new WeakHashMap<>();
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        a aVar = new a();
        int[] iArr = wac.u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.searchViewStyle, 0);
        umf umfVar = new umf(context, typedArrayObtainStyledAttributes);
        epg.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.h0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.i0 = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.j0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.k0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.l0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.m0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.n0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.o0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.v0 = imageView5;
        viewFindViewById.setBackground(umfVar.b(10));
        viewFindViewById2.setBackground(umfVar.b(14));
        imageView.setImageDrawable(umfVar.b(13));
        imageView2.setImageDrawable(umfVar.b(7));
        imageView3.setImageDrawable(umfVar.b(4));
        imageView4.setImageDrawable(umfVar.b(16));
        imageView5.setImageDrawable(umfVar.b(13));
        this.w0 = umfVar.b(12);
        qnf.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.x0 = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.y0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(dVar);
        imageView3.setOnClickListener(dVar);
        imageView2.setOnClickListener(dVar);
        imageView4.setOnClickListener(dVar);
        searchAutoComplete.setOnClickListener(dVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(fVar);
        searchAutoComplete.setOnItemClickListener(gVar);
        searchAutoComplete.setOnItemSelectedListener(hVar);
        searchAutoComplete.setOnKeyListener(eVar);
        searchAutoComplete.setOnFocusChangeListener(new pud(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.B0 = typedArrayObtainStyledAttributes.getText(6);
        this.K0 = typedArrayObtainStyledAttributes.getText(11);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        umfVar.f();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.z0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.p0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new qud(this));
        }
        x(this.G0);
        u();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.M0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.M0 = false;
    }

    public int getImeOptions() {
        return this.h0.getImeOptions();
    }

    public int getInputType() {
        return this.h0.getInputType();
    }

    public int getMaxWidth() {
        return this.N0;
    }

    public CharSequence getQuery() {
        return this.h0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.K0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.T0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.B0 : getContext().getText(this.T0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.y0;
    }

    public int getSuggestionRowLayout() {
        return this.x0;
    }

    public f93 getSuggestionsAdapter() {
        return this.I0;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.Q0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.U0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.T0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.U0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.h0;
        if (i2 >= 29) {
            i.a(searchAutoComplete);
            return;
        }
        m mVar = Y0;
        mVar.getClass();
        m.a();
        Method method = mVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        mVar.getClass();
        m.a();
        Method method2 = mVar.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.h0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.G0) {
            j jVar = this.D0;
            if (jVar == null || !jVar.b()) {
                clearFocus();
                x(true);
            }
        }
    }

    public final void n(int i2) {
        int position;
        String strI;
        Cursor cursor = this.I0.c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentJ = null;
            try {
                int i3 = aze.m0;
                String strI2 = aze.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strI2 == null) {
                    strI2 = this.T0.getSuggestIntentAction();
                }
                if (strI2 == null) {
                    strI2 = "android.intent.action.SEARCH";
                }
                String strI3 = aze.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strI3 == null) {
                    strI3 = this.T0.getSuggestIntentData();
                }
                if (strI3 != null && (strI = aze.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strI3 = strI3 + "/" + Uri.encode(strI);
                }
                intentJ = j(strI3 == null ? null : Uri.parse(strI3), strI2, aze.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), aze.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i2) {
        Editable text = this.h0.getText();
        Cursor cursor = this.I0.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String strD = this.I0.d(cursor);
        if (strD != null) {
            setQuery(strD);
        } else {
            setQuery(text);
        }
    }

    @Override // defpackage.g92
    public final void onActionViewCollapsed() {
        r("");
        clearFocus();
        x(true);
        this.h0.setImeOptions(this.S0);
        this.R0 = false;
    }

    @Override // defpackage.g92
    public final void onActionViewExpanded() {
        if (this.R0) {
            return;
        }
        this.R0 = true;
        SearchAutoComplete searchAutoComplete = this.h0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.S0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.V0);
        post(this.W0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.h0;
            int[] iArr = this.t0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.u0;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.r0;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.s0;
            rect2.set(i8, 0, i9, i10);
            n nVar = this.q0;
            if (nVar == null) {
                n nVar2 = new n(searchAutoComplete, rect2, rect);
                this.q0 = nVar2;
                setTouchDelegate(nVar2);
            } else {
                nVar.b.set(rect2);
                Rect rect3 = nVar.d;
                rect3.set(rect2);
                int i11 = -nVar.e;
                rect3.inset(i11, i11);
                nVar.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.H0) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.N0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.N0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.N0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        x(savedState.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.H0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.V0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.h0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        k kVar = this.C0;
        if (kVar != null) {
            kVar.b(text.toString());
            return;
        }
        if (this.T0 != null) {
            getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r(String str) {
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.setText(str);
        if (str != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.Q0 = str;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.M0 || !isFocusable()) {
            return false;
        }
        if (this.H0) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.h0.requestFocus(i2, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.h0.getText());
        int i2 = (!zIsEmpty || (this.G0 && !this.R0)) ? 0 : 8;
        ImageView imageView = this.n0;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.U0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.h0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.F0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.G0 == z) {
            return;
        }
        this.G0 = z;
        x(z);
        u();
    }

    public void setImeOptions(int i2) {
        this.h0.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.h0.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.N0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(j jVar) {
        this.D0 = jVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.E0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(k kVar) {
        this.C0 = kVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.F0 = onClickListener;
    }

    public void setOnSuggestionListener(l lVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.K0 = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.L0 = z;
        f93 f93Var = this.I0;
        if (f93Var instanceof aze) {
            ((aze) f93Var).e0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.T0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.h0
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.T0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.T0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.T0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            f93 r7 = r6.I0
            if (r7 == 0) goto L3b
            r7.c(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.T0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            aze r7 = new aze
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.T0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.X0
            r7.<init>(r3, r6, r4, r5)
            r6.I0 = r7
            r2.setAdapter(r7)
            f93 r7 = r6.I0
            aze r7 = (defpackage.aze) r7
            boolean r3 = r6.L0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.e0 = r3
        L62:
            r6.u()
        L65:
            android.app.SearchableInfo r7 = r6.T0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.T0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.z0
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.T0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.A0
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.O0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.H0
            r6.x(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.J0 = z;
        x(this.H0);
    }

    public void setSuggestionsAdapter(f93 f93Var) {
        this.I0 = f93Var;
        this.h0.setAdapter(f93Var);
    }

    public final void t() {
        int[] iArr = this.h0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.j0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.k0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.G0;
        SearchAutoComplete searchAutoComplete = this.h0;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.w0;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public final void v() {
        this.k0.setVisibility(((this.J0 || this.O0) && !this.H0 && (this.m0.getVisibility() == 0 || this.o0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z) {
        boolean z2 = this.J0;
        this.m0.setVisibility((!z2 || !(z2 || this.O0) || this.H0 || !hasFocus() || (!z && this.O0)) ? 8 : 0);
    }

    public final void x(boolean z) {
        this.H0 = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.h0.getText());
        this.l0.setVisibility(i3);
        w(!zIsEmpty);
        this.i0.setVisibility(z ? 8 : 0);
        ImageView imageView = this.v0;
        imageView.setVisibility((imageView.getDrawable() == null || this.G0) ? 8 : 0);
        s();
        if (this.O0 && !this.H0 && zIsEmpty) {
            this.m0.setVisibility(8);
            i2 = 0;
        }
        this.o0.setVisibility(i2);
        v();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return z3.o(sb, this.c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }
}
