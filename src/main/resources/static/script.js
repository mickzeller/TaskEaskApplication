function rowData() {
    var table = document.getElementById("table");
    var rows = table.getElementsByTagName("tr");
    for (i = 0; i < rows.length; i++) {
        var currentRow = table.rows[i];
        var createClickHandler =
            function (row) {
                return function () {
                    var cell = row.getElementsByTagName("td")[0];
                    var cell1 = row.getElementsByTagName("td")[1];
                    var cell2 = row.getElementsByTagName("td")[2];
                    var id = cell.innerHTML;
                    var id1 = cell1.innerHTML;
                    var id2 = cell2.innerHTML;
                    alert("Year: " + id + "\nActress: " + id1 + "\nMovie: " + id2);
                };
            };

        currentRow.onclick = createClickHandler(currentRow);
    }
}