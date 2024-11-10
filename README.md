# 補足説明

- ファイル構成は以下となっており、`src`配下の`baseball`パッケージ以下をご覧ください。

```
❯ tree
.
└── baseball
    ├── README.md
    ├── bin
    │   └── baseball
    │       ├── BaseBallTeam.class
    │       └── Review03.class
    ├── lib
    └── src
        └── baseball
            ├── BaseBallTeam.java
            └── Review03.java

7 directories, 5 files
```

- 以下の要件については、「自クラス内のフィールドを直接参照する方法」を採用しています。

> チーム名／勝数／負け数／引き分け数は、以下のどちらかの方法で参照してください：
>
> - 自クラス内のフィールドを直接参照する方法
> - getter メソッドを用いて値を参照する方法
> - ※いずれにしても勝率は getRate メソッドを用いて値を取得してください
