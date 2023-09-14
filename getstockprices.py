from distutils.spawn import spawn
import requests


from bs4 import BeautifulSoup
def get_html(symbol):
    """ Get the HTML of a URL """
    headers = {'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.3 Safari/605.1.15'}
    uxrl = 'https://finance.yahoo.com/quote/{symbol}'



    r = requests.get(uxrl, headers=headers)

    soup = BeautifulSoup(r.text, 'html.parser')
    stock = {
        'symbol': symbol,
        'price': soup.find('fin-streamer', {'class': 'Fw(b) Fz(36px) Mb(-4px) D(ib)'}).text,
        'change': soup.find('fin-streamer', {'class': 'Fw(500) Pstart(8px) Fz(24px)'}).text






    }
    return stock

print(get_html('AAPL'))





