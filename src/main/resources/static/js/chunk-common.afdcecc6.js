(window.webpackJsonp=window.webpackJsonp||[]).push([["chunk-common"],{"162e":function(e,a,t){"use strict";t("b0c0"),t("ac1f"),t("1276");var n={name:"layout",components:{},data:function(){return{menuList:[{title:"首页",pageName:"Home"},{title:"首页2",pageName:"Weifuwu"},{title:"首页3",pageName:"Home3"},{title:"首页4",pageName:"Home4"}]}},computed:{activePage:function(){return this.$route.name.split("_").shift()}},watch:{},created:function(){},mounted:function(){},methods:{changeMenu:function(e,a){e.name!==this.activePage&&(window.location.href="/".concat(e.pageName.toLowerCase(),".html"))}}};t("5e47"),t=t("2877"),n=Object(t.a)(n,(function(){var e=this,a=e.$createElement,t=e._self._c||a;return t("div",{staticClass:"layout"},[t("div",{staticClass:"layout-header"},[t("div",{staticClass:"logo"}),t("div",{staticClass:"menu"},e._l(e.menuList,(function(a,n){return t("div",{key:n,staticClass:"menu-item",class:{active:a.pageName===e.activePage},on:{click:function(t){return e.changeMenu(a,n)}}},[e._v(e._s(a.title))])})),0),t("div",{staticClass:"btns"})]),t("div",{staticClass:"layout-content"},[t("router-view")],1)])}),[],!1,null,null,null);a.a=n.exports},"24ab":function(e,a,t){},4360:function(e,a,t){"use strict";var n=t("2b0e");t=t("2f62");n.default.use(t.a),a.a=new t.a.Store({state:{},mutations:{},actions:{},modules:{}})},"5e47":function(e,a,t){"use strict";t("cca6b")},6171:function(e,a,t){"use strict";var n={};function u(e){return JSON.parse(JSON.stringify(e))}function c(e){var a=1<arguments.length&&void 0!==arguments[1]?arguments[1]:null,t=[];return 2<arguments.length&&void 0!==arguments[2]&&arguments[2]?Object.getOwnPropertyNames(e).forEach((function(a){"default"!==a&&t.push({value:Number(a),label:e[a]})})):Object.getOwnPropertyNames(e).forEach((function(a){"default"!==a&&t.push({value:a,label:e[a]})})),a&&t.unshift(a),t}function f(e){for(var a=n["".concat(e,"Data")],t=arguments.length,u=new Array(1<t?t-1:0),c=1;c<t;c++)u[c-1]=arguments[c];return a?a[u[0]]||a.default:o[e]?o[e].apply(o,u):""}function d(e,a){var t=2<arguments.length&&void 0!==arguments[2]?arguments[2]:"second";a=a?new Date(a):new Date;return a.setHours(a.getHours()+e),f(t,a)}function s(e,a){var t=2<arguments.length&&void 0!==arguments[2]?arguments[2]:"date";a=a?new Date(a):new Date;return a.setDate(a.getDate()+e),f(t,a)}t.r(n),t.d(n,"cardTypeData",(function(){return l})),t("a9e3"),t("7039"),t("159b");var l={0:"身份证",1:"护照",2:"军人身份证",6:"社会保障卡",A:"武装警察身份证",B:"港澳通行证",C:"台湾居民来往大陆通行证",E:"户口簿",F:"临时身份证",P:"外国人永久居留证",default:""},o=(t("99af"),t("9129"),t("b680"),t("d3b7"),t("25f0"),{month:function(e){if(e){var a=r(e),t=(e=a.year,a.month);return"".concat(e,"-").concat(t)}return""},date:function(e){if(e){var a=r(e),t=a.year;e=a.month,a=a.day;return"".concat(t,"-").concat(e,"-").concat(a)}return""},minute:function(e){if(e){var a=r(e),t=a.year,n=a.month,u=a.day,c=(e=a.hour,a.minute);return"".concat(t,"-").concat(n,"-").concat(u," ").concat(e,":").concat(c)}return""},second:function(e){if(e){var a=r(e),t=a.year,n=a.month,u=a.day,c=a.hour,f=(e=a.minute,a.second);return"".concat(t,"-").concat(n,"-").concat(u," ").concat(c,":").concat(e,":").concat(f)}return""},decimalString:function(e){var a=1<arguments.length&&void 0!==arguments[1]?arguments[1]:2;return e=parseFloat(e),(e=Number.isNaN(e)?0:e).toFixed(a)},decimalFloat:function(e){var a=1<arguments.length&&void 0!==arguments[1]?arguments[1]:2;return parseFloat(this.decimalString(e,a))},int:function(e){return e=parseInt(e),Number.isNaN(e)?0:e}}),r=function(e){return e=new Date(e),{year:e.getFullYear(),month:i(e.getMonth()+1),day:i(e.getDate()),hour:i(e.getHours()),minute:i(e.getMinutes()),second:i(e.getSeconds())}},i=function(e){return(e=e.toString())[1]?e:"0"+e};a.a={install:function(e){e.prototype.func={copy:u,constDataToArray:c,filter:f,getRecentHour:d,getRecentDate:s}}}},7378:function(e,a,t){"use strict";var n=t("0fb7"),u=t("450d"),c=t("f529"),f=t.n(c),d=t("46a1"),s=t("e5f2"),l=t.n(s),o=t("9e1f"),r=t("6ed5"),i=t.n(r),b=t("be4f"),p=t("896a"),m=t.n(p),g=t("920a"),v=t("4f0c"),h=t.n(v),y=t("0fb4"),w=t("9944"),N=t.n(w),x=t("bc1c"),D=t("4726"),E=t.n(D),O=t("f92a"),$=t("d775"),_=t.n($),C=t("279e"),P=t("7d94"),S=t.n(P),j=t("fa4c"),H=t("e360"),F=t.n(H),L=t("acb6"),k=t("c673"),A=t.n(k),M=t("e3ea"),T=t("7bc3"),U=t.n(T),J=t("fd71"),I=t("a447"),R=t.n(I),z=t("2f02"),B=t("fe11"),V=t.n(B),W=t("ed7b"),Y=t("e1a5"),q=t.n(Y),G=t("bdc7"),K=t("aa2f"),Q=t.n(K),X=t("de31"),Z=t("c69e"),ee=t.n(Z),ae=t("a769"),te=t("5cc3"),ne=t.n(te),ue=t("a673"),ce=t("7b31"),fe=t.n(ce),de=t("adec"),se=t("3d2d"),le=t.n(se),oe=t("6762"),re=t("dd3d"),ie=t.n(re),be=t("a586"),pe=t("7464"),me=t.n(pe),ge=t("28b2"),ve=t("c7ad"),he=t.n(ve),ye=t("b0ee"),we=t("d180"),Ne=t.n(we),xe=t("a335"),De=t("c0bb"),Ee=t.n(De),Oe=t("186a"),$e=t("301f"),_e=t.n($e),Ce=t("96dc"),Pe=t("9cea");n=t.n(Pe),u=t("9c49"),c=t("6640"),d=t.n(c),s=t("d2ac"),o=t("95b0"),r=t.n(o),b=t("78a7"),p=t("33ca"),g=t.n(p),v=t("b8e0"),y=t("a4c4"),w=t.n(y),x=t("e2f3"),D=t("06f9"),O=t.n(D),$=t("f3e4"),C=t("9dda"),P=t.n(C),j=t("6b30"),H=t("c284"),L=t.n(H),k=t("f225"),M=t("89a9"),T=t.n(M),J=t("f4f9"),I=t("c2cc"),z=t.n(I),B=t("7a0f"),W=t("0f6c"),Y=t.n(W),G=t("aaa5"),K=t("a578"),X=t.n(K),Z=t("b5c2"),ae=t("20cf"),te=t.n(ae),ue=t("915d"),ce=t("e04d"),de=t.n(ce),se=t("5e32"),oe=t("6721"),re=t.n(oe),be=t("cbb5"),pe=t("8bbc"),ge=t.n(pe),ve=t("e612"),ye=t("dd87"),we=t.n(ye),xe=t("075a"),De=t("72aa"),Oe=t.n(De),$e=t("eca7"),Ce=t("3787"),Pe=t.n(Ce),u=t("425f"),c=t("4105"),s=t.n(c),o=t("b84d"),b=t("c216"),p=t.n(b),v=t("8f24"),y=t("76b9"),x=t.n(y),D=t("0c67"),$=t("299c"),C=t.n($),j=t("06f1"),H=t("6ac9"),k=t.n(H),M=t("4ffc"),J=t("946e"),I=t.n(J),B=t("d624"),W=t("3e9c"),G=t.n(W),K=t("826b"),Z=t("c263"),ae=t.n(Z),ue=t("5466"),ce=t("ecdf"),se=t.n(ce),oe=t("38a0"),be=t("ad41"),pe=t.n(be),ve=t("ae26"),ye=t("845f"),xe=t.n(ye),De=t("1951"),$e=t("eedf"),Ce=t.n($e),u=t("016f"),c=t("486c"),o=t.n(c),b=t("6611"),v=t("e772"),y=t.n(v),D=t("1f1a"),$=t("4e4b"),j=t.n($),H=t("e960"),M=t("b35b"),J=t.n(M),B=t("d4df"),W=t("7fc1"),K=t.n(W),Z=t("c526"),ue=t("1599"),ce=t.n(ue),oe=t("560b"),be=t("dcdc"),ve=t.n(be),ye=t("3c52"),De=t("0d7b"),$e=t.n(De),u=t("fe07"),c=t("6ac5"),b=t.n(c),v=t("b5d8"),D=t("f494"),$=t.n(D),H=t("9d4c"),M=t("e450"),B=t.n(M),W=t("10cb"),Z=t("f3ad"),ue=t.n(Z),oe=t("34db"),be=t("3803"),ye=t.n(be),De=t("8bd8"),u=t("4cb2"),c=t.n(u),v=t("ce18"),D=t("f58e"),H=t.n(D),M=t("4ca3"),W=t("443e"),Z=t.n(W),oe=t("bd49"),be=t("18ff"),De=t.n(be),u=t("960d"),v=t("defb"),D=t.n(v),M=t("cb70"),W=t("b370"),oe=t.n(W),be=t("3db2"),u=t("58b8"),v=t.n(u),M=t("a7cc"),W=t("df33"),be=t.n(W),u=t("672e"),M=t("101e"),W=t.n(M),u=t("2b0e"),M=t("24ab");u.default.prototype.$ELEMENT={size:"small",zIndex:3e3},u.default.use(W.a),u.default.use(be.a),u.default.use(v.a),u.default.use(oe.a),u.default.use(D.a),u.default.use(De.a),u.default.use(Z.a),u.default.use(H.a),u.default.use(c.a),u.default.use(ye.a),u.default.use(ue.a),u.default.use(B.a),u.default.use($.a),u.default.use(b.a),u.default.use($e.a),u.default.use(ve.a),u.default.use(ce.a),u.default.use(K.a),u.default.use(J.a),u.default.use(j.a),u.default.use(y.a),u.default.use(o.a),u.default.use(Ce.a),u.default.use(xe.a),u.default.use(pe.a),u.default.use(se.a),u.default.use(ae.a),u.default.use(G.a),u.default.use(I.a),u.default.use(k.a),u.default.use(C.a),u.default.use(x.a),u.default.use(p.a),u.default.use(s.a),u.default.use(Pe.a),u.default.use(Oe.a),u.default.use(we.a),u.default.use(ge.a),u.default.use(re.a),u.default.use(de.a),u.default.use(te.a),u.default.use(X.a),u.default.use(Y.a),u.default.use(z.a),u.default.use(T.a),u.default.use(L.a),u.default.use(P.a),u.default.use(O.a),u.default.use(w.a),u.default.use(g.a),u.default.use(r.a),u.default.use(d.a),u.default.use(n.a),u.default.use(_e.a),u.default.use(Ee.a),u.default.use(Ne.a),u.default.use(he.a),u.default.use(me.a),u.default.use(ie.a),u.default.use(le.a),u.default.use(fe.a),u.default.use(ne.a),u.default.use(ee.a),u.default.use(Q.a),u.default.use(q.a),u.default.use(V.a),u.default.use(R.a),u.default.use(U.a),u.default.use(A.a),u.default.use(F.a),u.default.use(S.a),u.default.use(_.a),u.default.use(E.a),u.default.use(N.a),u.default.use(h.a),u.default.use(m.a.directive),u.default.prototype.$loading=m.a.service,u.default.prototype.$msgbox=i.a,u.default.prototype.$alert=i.a.alert,u.default.prototype.$confirm=i.a.confirm,u.default.prototype.$prompt=i.a.prompt,u.default.prototype.$notify=l.a,u.default.prototype.$message=f.a},b20f:function(e,a,t){},cca6b:function(e,a,t){},db49:function(e,a,t){"use strict";var n="pre"===Object({NODE_ENV:"production",BASE_URL:""}).VUE_APP_TITLE?"pre":"production",u={loginPath:"/pages/login/login"},c={};c="release"==n?Object.assign({},u,{env:"release",baseUrl:"http://api.xxx.com",debug:!1}):"pre"==n?Object.assign({},u,{env:"pre",baseUrl:"http://pre-api.xxx.com",debug:!0}):Object.assign({},u,{env:"dev",baseUrl:"http://dev-api.xxx.com",debug:!0});a.a=c}}]);