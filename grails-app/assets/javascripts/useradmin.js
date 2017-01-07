function create() {
    window.location.href="/user/admin/create";
}

function update(id) {
    window.location.href="/user/admin/update?id=" + id;
}

function deleteByID(id) {
    var url = "/user/delete";
    $.ajax({
        url: url,
        data: ({
            id: id
        }),
        success: function (result) {
            location.reload();
        },
        failure: function (result) {
            alert("Failure!")
        }
    });
}

function signout() {
    window.location.href="/controller/logout";
}