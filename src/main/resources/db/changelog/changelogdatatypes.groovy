databaseChangeLog  {
//    property (name: "boolean.type", value: "boolean", dbms: "postgresql")

    // Liquibasemaps a bigint to a NUMBER(38, 0) for oracle.  To match existing datatypes, we'll alias them
    // for H2 and Oracle.

    property(name: "bigint.type", value: "NUMBER(19,0)", dbms: "oracle")
    property(name: "bigint.type", value: "bigint", dbms: "h2")

    // H2 maps NUMBER(10, 0) to be a decimal value and we need an integer type.
    property(name: "int.type", value: "NUMBER(10,0)", dbms: "oracle")
    property(name: "int.type", value: "int", dbms: "h2")

    // For similar reasons above oracle uses NUMBER(1,0) for booleans, and H2 uses boolean
    property (name: "boolean.type", value: "NUMBER(1,0)", dbms: "oracle")
    property (name: "boolean.type", value: "boolean", dbms: "h2")

}

