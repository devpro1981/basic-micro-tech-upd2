import java.time.LocalDateTime
import java.time.Month

databaseChangeLog {

    changeSet(author: 'salim', id: '1', dbms: 'h2') {
        createSequence(sequenceName: 'HIBERNATE_SEQUENCE', startValue: '50000', incrementBy: '1')
    }

    changeSet(id: '2', author: 'salim'/*, objectQuotingStrategy: 'QUOTE_ALL_OBJECTS'*/ ) {
        createTable(tableName: 'APPLICATION_SETTINGS') {
            column(name: 'ID', type: '${bigint.type}') {
                constraints(primaryKey: true, primaryKeyName: 'APPLICATION_SETTINGS_PK')
            }
            column(name: 'VERSION', type: '${bigint.type}') {
                constraints(nullable: false)
            }
            column(name: 'DATE_CREATED', type: 'TIMESTAMP(6)')
            column(name: 'LAST_UPDATED', type: 'TIMESTAMP(6)')

        }
    }

    changeSet(id: '3', author: 'salim', objectQuotingStrategy: 'QUOTE_ALL_OBJECTS') {
        addColumn(tableName: 'APPLICATION_SETTINGS') {
            column(name: 'KEY', type: 'VARCHAR2(255)')
        }
    }


}

